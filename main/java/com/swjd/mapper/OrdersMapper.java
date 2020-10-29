package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.Orders;

import java.util.List;

public interface OrdersMapper extends BaseMapper<Orders> {
    //根据用户Id查
    public abstract List<Orders> findAll(int uid);
}
