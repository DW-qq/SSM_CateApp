package com.swjd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.bean.Grang;
import com.swjd.bean.Wine;
import com.swjd.mapper.WineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WineServiceImpl extends ServiceImpl<WineMapper,Wine> implements WineService {
    @Autowired
    WineMapper wineMapper;
    @Override
    public List<Wine> getFindAll(Integer page,Integer rows) {
        return wineMapper.findAll(page,rows);
    }

    @Override
    public Page<Wine> queryFenYe(int pageIndex, int pageSize) {
        return wineMapper.queryFenYe(new Page(pageIndex,pageSize));
    }

    @Override
    public Wine findById(int id) {
        return wineMapper.findById(id);
    }
}
