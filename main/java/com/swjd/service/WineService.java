package com.swjd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Grang;
import com.swjd.bean.Wine;

import java.util.List;

public interface WineService extends IService<Wine> {
    //查询
    public abstract List<Wine> getFindAll(Integer page,Integer rows);
    //分页查询
    public abstract Page<Wine> queryFenYe(int pageIndex, int pageSize);
    //单个查询
    public abstract Wine findById(int id);
}
