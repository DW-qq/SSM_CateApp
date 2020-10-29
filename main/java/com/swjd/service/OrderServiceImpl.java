package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Orders;
import com.swjd.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrdersMapper,Orders> implements OrderService {

    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public List<Orders> findAll(int uid) {
        return ordersMapper.findAll(uid);
    }
}
