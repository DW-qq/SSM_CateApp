package com.swjd.controller;

import com.swjd.bean.Nonpayment;
import com.swjd.service.NonpaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nonpaymentController")
public class NonpaymentController {

    @Autowired
    NonpaymentService nonpaymentService;
    @CrossOrigin
    @RequestMapping(value = "/addNonpayment",produces ="application/json; charset=utf-8",method = RequestMethod.POST)
    @ResponseBody
    public boolean addOrder(@RequestBody List<Nonpayment> nonpayments){
        boolean flag = nonpaymentService.saveBatch(nonpayments);
        System.out.println("接收"+nonpayments);
        return flag;
    }

    @RequestMapping("/findById/{uid}")
    @ResponseBody
    public List<Nonpayment> findById(@PathVariable("uid") int uid){
        List<Nonpayment> list = nonpaymentService.findById(uid);
        return list;
    }

    @RequestMapping("/deleteById/{nid}")
    @ResponseBody
    public boolean deleteById(@PathVariable("nid") int nid){
        boolean jg = nonpaymentService.removeById(nid);
        return  jg;
    }
}
