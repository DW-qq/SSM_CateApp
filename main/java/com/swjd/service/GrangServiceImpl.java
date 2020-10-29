package com.swjd.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Grang;
import com.swjd.mapper.GrangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrangServiceImpl extends ServiceImpl<GrangMapper,Grang> implements GrangService {
    @Autowired
    GrangMapper grangMapper;

    @Override
    public List<Grang> getFindAll(Integer page, Integer rows) {

        return grangMapper.findAll(page, rows);
    }

    @Override
    public Page<Grang> queryFenYe(int pageIndex,int pageSize) {


        return grangMapper.queryFenYe(new Page(pageIndex,pageSize));
    }

    @Override
    public Grang findById(int id) {
        return grangMapper.findById(id);
    }


}
