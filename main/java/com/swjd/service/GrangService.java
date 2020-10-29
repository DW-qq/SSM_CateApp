package com.swjd.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Cake;
import com.swjd.bean.Grang;

import java.util.List;

public interface GrangService extends IService<Grang> {
    //查询
    public abstract List<Grang> getFindAll(Integer page,Integer rows);
    //分页查询
    public abstract Page<Grang> queryFenYe(int pageIndex,int pageSize);
    //单个查询
    public abstract Grang findById(int id);
}
