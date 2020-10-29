package com.swjd.controller;

import com.swjd.bean.Cake;
import com.swjd.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cakeController")
public class CakeController {
    @Autowired
    CakeService cakeService;

    @RequestMapping("/toAll")
    @ResponseBody
    public Object toAll(){
        List<Cake> list = cakeService.getFindAll(0,4);
        System.out.println(list.get(0).getCakeId());
        return list;
    }


}
