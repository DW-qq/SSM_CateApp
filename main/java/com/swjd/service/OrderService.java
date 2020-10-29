package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Orders;

import java.util.List;

public interface OrderService extends IService<Orders> {
    //根据用户Id查
    public abstract List<Orders> findAll(int uid);
}
