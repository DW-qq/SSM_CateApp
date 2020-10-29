package com.swjd.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.swjd.wxpay.sdk.MyWXPayConfig;
import com.swjd.wxpay.sdk.WXPay;
import io.goeasy.GoEasy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/wxpay")
public class WXpayController {
    @RequestMapping("/showPay")
    public String showPay(){
        return "pay";
    }
    //编写下单接口
    @RequestMapping("/doPay/{uid}")
    @ResponseBody
    public void doPay(HttpServletResponse response, @PathVariable("uid") int uid) {
        //用于生成订单编号的随机数
       Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHssmm");
        String oderIdPrefix = sdf.format(date);
        String pid = "201";//商品id
        String orderId = oderIdPrefix+uid;
        //商户信息
        MyWXPayConfig config = new MyWXPayConfig();
        //创建支付对象
        WXPay wxpay=null;
        try {
             wxpay = new WXPay(config);

            Map<String, String> data = new HashMap<String, String>();
            data.put("body", "请支付");
            data.put("out_trade_no", orderId);//订单编号
            data.put("device_info", "");//设备信息
            data.put("fee_type", "CNY");//货币单位
            data.put("total_fee", "1");//1分
            data.put("spbill_create_ip", "123.12.12.123");
            //需要一个回调接口，获取接口信息
            data.put("notify_url", "http://numasm.natappfree.cc/wxpay/notify_url");
            data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
            data.put("product_id", "12");//商品Id
            Map<String, String> resp = wxpay.unifiedOrder(data);
            //二维码连接
            /*System.out.println(resp);*/
            String code_url = resp.get("code_url");

            //生成二维码
            //二维码需要包含的文本内容
            HashMap<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            hints.put(EncodeHintType.MARGIN, 2);
            try {
                BitMatrix bitMatrix = new MultiFormatWriter().encode(code_url, BarcodeFormat.QR_CODE,
                        200, 200, hints);
                MatrixToImageWriter.writeToStream(bitMatrix, "PNG", response.getOutputStream());
                System.out.println("创建二维码完成");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/notify_url")
    public void getNotifyURL(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //获得微信发送过来的请求，从请求中获取数据
        ServletInputStream is = request.getInputStream();
        System.out.println("进来看");
        byte[] b = new byte[1024];
        int len =0;
        while ((len = is.read(b))!= -1){
            String str = new String(b,0,len);
            System.out.println(str);
        }
        //返回一个标准格式回信
        response.getWriter().write("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>");

        GoEasy goEasy = new GoEasy("http://rest-hangzhou.goeasy.io","BC-cb5debe56ddc447781555fd78863b3b2");
        goEasy.publish("state","200");

        //手写json
        /*goEasy.publish("name","{\"mes\":\"success\"}");*/

    }
}
