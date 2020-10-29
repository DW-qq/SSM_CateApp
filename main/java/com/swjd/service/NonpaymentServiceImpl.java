package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Nonpayment;
import com.swjd.mapper.NonpaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NonpaymentServiceImpl extends ServiceImpl<NonpaymentMapper,Nonpayment> implements NonpaymentService{
  @Autowired
  NonpaymentMapper nonpaymentMapper;
    @Override
    public List<Nonpayment> findById(int uid) {
        return nonpaymentMapper.findById(uid);
    }
}
