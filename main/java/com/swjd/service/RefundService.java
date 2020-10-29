package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Refund;

import java.util.List;

public interface RefundService extends IService<Refund> {
    //根据Id查询
    public abstract List<Refund> findById(int uid);
}
