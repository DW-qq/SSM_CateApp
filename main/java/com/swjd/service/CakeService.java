package com.swjd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Cake;

import java.util.List;

public interface CakeService extends IService<Cake> {
    //查询
    public abstract List<Cake> getFindAll(Integer page,Integer rows);
    //分页查询
    public abstract Page<Cake> queryFenYe(int pageIndex, int pageSize);
    //单个查询
    public abstract Cake findById(int id);

}
