package com.swjd.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swjd.bean.Cake;
import com.swjd.bean.Grang;
import com.swjd.bean.Wine;
import com.swjd.service.CakeService;
import com.swjd.service.GrangService;
import com.swjd.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/homeController")
public class HomeController {
    @Autowired
    CakeService cakeService;
    @Autowired
    GrangService grangService;
    @Autowired
    WineService wineService;

    @RequestMapping("/findType/{type}/{pageIndex}")
    @ResponseBody
    public Object findType(@PathVariable("type") String type,@PathVariable("pageIndex") int pageIndex){
        List list=null;
         int pageSize = 4;
         if(pageIndex>1){
             pageSize = pageIndex*4;
         }
        System.out.println("pageSize"+pageSize);
        if(type.equals("cake")){
            Page<Cake> page = cakeService.queryFenYe(0,pageSize);
            /*System.out.println("pageIndex"+pageIndex);*/

            list = page.getRecords();
            System.out.println(list);
        }else if(type.equals("grang")){
            Page<Grang> page = grangService.queryFenYe(0,pageSize);
            list = page.getRecords();
            /*System.out.println(list);*/
        }else if(type.equals("wine")){
            Page<Wine> page = wineService.queryFenYe(0,pageSize);
            list = page.getRecords();
            System.out.println(list);
        }
        return list;
    }

    @RequestMapping("/findById/{id}/{type}")
    @ResponseBody
    public Object findById(@PathVariable("id") int id,@PathVariable("type") String type){
        if(type.equals("cake")){
            Cake cake = cakeService.findById(id);
            System.out.println(cake);
            return cake;
        }else if(type.equals("grang")){
            System.out.println(grangService.findById(id));
            return grangService.findById(id);
        }else if(type.equals("wine")){
            System.out.println(wineService.findById(id));
            return wineService.findById(id);
        }
       return 500;
    }
}
