package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.Goodsall;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsAllService extends IService<Goodsall> {
    //查询
    public abstract List<Goodsall> getFindAll(Integer page, Integer rows,Integer dessertId);
    //单个查询
    public abstract Goodsall findById(int id);
    //根据销售排行
    public abstract List<Goodsall> findByNum();
    //条件查询
    //条件查询
    public abstract List<Goodsall> findByTj(String goodsName);
}
