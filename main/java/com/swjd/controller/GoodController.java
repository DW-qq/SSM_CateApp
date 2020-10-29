package com.swjd.controller;

import com.swjd.bean.Goodsall;
import com.swjd.service.GoodsAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goodController")
public class GoodController {
    @Autowired
    GoodsAllService goodsAllService;

    @RequestMapping("/findType/{pageIndex}/{dessertId}")
    @ResponseBody
    public Object findType(@PathVariable("pageIndex") Integer pageIndex,@PathVariable("dessertId") Integer dessertId){
        int pageSize = 4;
        if(pageIndex>1){
            pageSize = pageIndex*4;
        }
        List<Goodsall> list = goodsAllService.getFindAll(0,pageSize,dessertId);
        return list;
    }

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public Object findById(@PathVariable("id") int id){
        Goodsall goodsall = goodsAllService.findById(id);
        return goodsall;
    }
    @RequestMapping("/findByNum")
    @ResponseBody
    public Object findByNum(){
        List<Goodsall> list = goodsAllService.findByNum();
        return list;
    }
    /*@RequestMapping(value = "/findByTj/{map}",produces = "text/html;charset=utf-8")*/
    @RequestMapping(value = "/findByTj/{goodsName}")
    @ResponseBody
    public Object findByTj(@PathVariable String goodsName){
        System.out.println(goodsName);
        List<Goodsall> list = goodsAllService.findByTj(goodsName);
        return list;
    }
}
