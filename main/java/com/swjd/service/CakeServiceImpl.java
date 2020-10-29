package com.swjd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Cake;
import com.swjd.bean.Grang;
import com.swjd.mapper.CakeMapper;
import com.swjd.mapper.GrangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeServiceImpl extends ServiceImpl<CakeMapper, Cake> implements CakeService {
    @Autowired
    CakeMapper cakeMapper;
    @Override
    public List<Cake> getFindAll(Integer page,Integer rows) {
        return cakeMapper.findAll(page,rows);
    }

    @Override
    public Page<Cake> queryFenYe(int pageIndex, int pageSize) {
        return cakeMapper.queryFenYe(new Page(pageIndex,pageSize));
    }

    @Override
    public Cake findById(int id) {
        return cakeMapper.findById(id);
    }
}
