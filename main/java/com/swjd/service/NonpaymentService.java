package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Nonpayment;

import java.util.List;

public interface NonpaymentService extends IService<Nonpayment> {
    //根据id查询
    public abstract List<Nonpayment> findById(int uid);
}
