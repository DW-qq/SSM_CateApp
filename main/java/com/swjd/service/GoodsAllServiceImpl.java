package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Goodsall;
import com.swjd.mapper.GoodsAllMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsAllServiceImpl  extends ServiceImpl<GoodsAllMapper, Goodsall> implements GoodsAllService  {
   @Autowired
   GoodsAllMapper goodsAllMapper;

    @Override
    public List<Goodsall> getFindAll(Integer page, Integer rows, Integer dessertId) {
        return goodsAllMapper.findAll(page,rows,dessertId);
    }

    @Override
    public Goodsall findById(int id) {
        return goodsAllMapper.findById(id);
    }

    @Override
    public List<Goodsall> findByNum() {
        return goodsAllMapper.findByNum();
    }

    @Override
    public List<Goodsall> findByTj(String goodsName) {
        return goodsAllMapper.findByTj(goodsName);
    }
}
