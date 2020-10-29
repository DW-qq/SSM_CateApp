package com.swjd.controller;

import com.swjd.bean.Refund;
import com.swjd.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/refundController")
public class RefundController {
    @Autowired
    RefundService refundService;

    @RequestMapping(value = "/addRefund",method = RequestMethod.POST)
    @ResponseBody
    public boolean addRefund(@RequestBody Refund refund){
        boolean jg = refundService.save(refund);
        return jg;
    }

    @RequestMapping("/findById/{uid}")
    @ResponseBody
    public List<Refund> findAll(@PathVariable("uid") int uid){
        List<Refund> list = refundService.findById(uid);
        return list;
    }
}
