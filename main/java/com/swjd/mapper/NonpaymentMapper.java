package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.Nonpayment;
import com.swjd.bean.Orders;

import java.util.List;

public interface NonpaymentMapper extends BaseMapper<Nonpayment> {
    //根据id查询
    public abstract List<Nonpayment> findById(int uid);
}
