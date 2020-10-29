package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Refund;
import com.swjd.mapper.RefundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RefundServiceImpl extends ServiceImpl<RefundMapper, Refund> implements RefundService {
    @Autowired
    RefundMapper refundMapper;
    @Override
    public List<Refund> findById(int uid) {
        return refundMapper.findById(uid);
    }
}
