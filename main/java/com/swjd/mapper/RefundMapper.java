package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.Refund;

import java.util.List;

public interface RefundMapper extends BaseMapper<Refund> {
    //根据Id查询
    public abstract List<Refund> findById(int uid);
}
