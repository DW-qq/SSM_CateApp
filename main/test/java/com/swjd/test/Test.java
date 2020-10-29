package com.swjd.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swjd.bean.*;
import com.swjd.mapper.GoodsAllMapper;
import com.swjd.mapper.GrangMapper;
import com.swjd.service.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@Component
public class Test {
@Autowired
    CakeService cakeService;
@Autowired
    GrangService grangService;
@Autowired
    WineService wineService;
@Autowired
    GrangMapper grangMapper;
@Autowired
    GoodsAllService goodsAllService;
@Autowired
    UserService userService;
@Autowired
OrderService orderService;
@Autowired
NonpaymentService nonpaymentService;


@org.junit.Test
    public void test1(){
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String data = sdf.format(date);
    System.out.println(data);
    System.out.println(userService.updateUser(new User(),12));
    /*Orders orders = new Orders(data,1,1,22);
    Orders orders2 = new Orders(data,1,1,22);
    Orders orders3 = new Orders(data,1,1,22);
    List<Orders> list = new ArrayList<>();
    list.add(orders);
    list.add(orders2);
    list.add(orders3);*/
    /*boolean num = orderService.saveBatch(list);
    System.out.println(num);*/

}
/*@org.junit.Test
    public void test2(){
    *//*Page<Grang> page = new Page<>(1,2);*//*
   Page<Wine> page =null;
   page= wineService.queryFenYe(0,6);
   List list = new ArrayList<>();
   List<Wine> list1 = page.getRecords();
   list.add(list1);
    System.out.println(list);

}*/
}
