package com.swjd.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swjd.bean.User;
import com.swjd.service.AliyunSmsService;
import com.swjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AliyunSmsService aliyunSmsService;

    int yzNum = 0;

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "a";
    }

    @RequestMapping("/findOne/{utelephone}")
    @ResponseBody
//根据手机号码查询
    public String findOne(@PathVariable("utelephone") String utelephone) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("utelephone", utelephone);
        List<User> list = userService.list(queryWrapper);
        if (list.size() > 0) {
            return "200";
        }
        return "500";
    }

    @RequestMapping("/findOneUser/{utelephone}/{upassword}")
    @ResponseBody
    //根据账号密码查询
    public List<User> findOneUser(@PathVariable("utelephone") String utelephone, @PathVariable("upassword") String upassword) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("utelephone", utelephone).eq("upassword", upassword);
        List<User> list = userService.list(queryWrapper);
        return list;
    }

    //添加用户
    @RequestMapping(value = "/addUser/{utelephone}/{upassword}")
    @ResponseBody
    public String addUser(@PathVariable("utelephone") String utelephone, @PathVariable("upassword") String upassword) {

        User user = new User(utelephone,upassword,"head1.jpeg");
        int num = userService.addUser(user);
        if (num > 0) {
            return "200";
        }
        return "500";
    }




/*@RequestMapping("/add")
@ResponseBody
    public String addUser(@RequestParam(value = "name",defaultValue = "2")String uname,@RequestParam(value = "pwd",defaultValue = "2") String pwd, Model model, MultipartFile file, HttpServletRequest request) throws IOException {
        String message = "";
        User user = null;
        if (file.isEmpty()) {
            return "500";
        }
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
            *//*String filePath = request.getSession().getServletContext().getRealPath("\\home");*//*
            String filePath = ("D:\\Learning world\\VueStudy\\cate_app\\src\\assets\\home");
            System.out.println(filePath);
            //获取原始图片的扩展名
            String originalFilename =  file.getOriginalFilename();
            //生成新文件的名字
            String newFileName = UUID.randomUUID()+originalFilename;
            //封装上传文件位置全路径
            File targetFile = new File(filePath,newFileName);
            file.transferTo(targetFile);
        System.out.println("路径："+targetFile);
        System.out.println("newFileName："+newFileName);

        user = new User(null,null,newFileName,null,null,"湖南");
        int jg = userService.addUser(user);
        if (jg>0){
            message="添加成功";
            System.out.println(message);
            model.addAttribute("message",message);
            model.addAttribute("user",user);
            return "200";
        }else
        {
            System.out.println(message);
            message="添加失败";
            model.addAttribute("message",message);
            return "100";
        }
    }*/

    //查询
    @RequestMapping("/findAll/{name}")
    @ResponseBody
    public List<User> findAll(@PathVariable("name") String name) {
        System.out.println(name);
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("/toDx")
    public String doDx() {
        return "dx";
    }

    @RequestMapping("/doDx/{telephone}")
    @ResponseBody
    public int toDx(@PathVariable String telephone) {
        int newcode = (int) (Math.random() * 9999) + 100;  //每次调用生成一位四位数的随机数
        yzNum = newcode;
        String code = Integer.toString(newcode);
        System.out.println("发送的验证码为：" + newcode);
        //发短信
        SendSmsResponse response = null;
        response = aliyunSmsService.sendSms(telephone, code);// TODO 填写你需要测试的手机号码
        System.out.println("短信接口返回的数据----------------");
        System.out.println("Code=" + response.getCode());
        System.out.println("Message=" + response.getMessage());
        System.out.println("RequestId=" + response.getRequestId());
        System.out.println("BizId=" + response.getBizId());
        return newcode;
    }


    @RequestMapping("/toYz/{yz}")
    @ResponseBody
    public int toYz(@PathVariable int yz) {
        if (yzNum != yz) {
            System.out.println("验证码错误");
            return 500;
        }
        System.out.println("登入成功");
        return 200;
    }

    //修改
    @RequestMapping(value = "/updateUser/{uid}", method = RequestMethod.POST)
    @ResponseBody
    public int updateUser(@RequestBody User user, @PathVariable("uid") int uid) {
        System.out.println(user);
        int jg = userService.updateUser(user, uid);
        if (jg > 0) {
            return 200;
        }
        return 500;
    }

    @RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
    @ResponseBody
    public Object handleUploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        // 判断所上传文件是否存在
        if (!file.isEmpty()) {
            String filePath = ("D:\\Learning world\\VueStudy\\cate_app\\src\\assets\\img\\my");
            System.out.println(filePath);
            //获取原始图片的扩展名
            String originalFilename =  file.getOriginalFilename();
            //生成新文件的名字
            String newFileName = UUID.randomUUID()+originalFilename;
            //封装上传文件位置全路径
            File targetFile = new File(filePath,newFileName);
            file.transferTo(targetFile);
            System.out.println("路径："+targetFile);
            System.out.println("newFileName："+newFileName);
            /* fileServlet.addUploadFIle(srcPath);*/
            return newFileName;
        }
       return "200";
    }
}

