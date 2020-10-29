package com.swjd.controller;

import com.swjd.bean.Orders;
import com.swjd.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orderController")
public class OderController {
    @Autowired
    OrderService ordersService;

    @CrossOrigin
    @RequestMapping(value = "/addOrder",produces ="application/json; charset=utf-8",method = RequestMethod.POST)
    @ResponseBody
    public boolean addOrder(@RequestBody List<Orders> order){
        boolean flag = ordersService.saveBatch(order);
        System.out.println("接收"+order);
        return flag;
    }

    @RequestMapping("/findById/{uid}")
    @ResponseBody
    public Object findById(@PathVariable("uid") int uid){
        List<Orders> list = ordersService.findAll(uid);
        return list;
    }

    @RequestMapping("/deleteById/{orderId}")
    @ResponseBody
    public boolean deleteById(@PathVariable("orderId") int orderId){
        boolean jg = ordersService.removeById(orderId);
        return jg;
    }
}
