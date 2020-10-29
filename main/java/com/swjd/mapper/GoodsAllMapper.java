package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.Goodsall;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsAllMapper extends BaseMapper<Goodsall> {
    //查询
    public abstract List<Goodsall> findAll(@Param("page") Integer page, @Param("rows") Integer rows,@Param("dessertId") Integer dessertId);
    //根据id单个查询
    public abstract Goodsall findById(int id);
    //根据销售排行
    public abstract List<Goodsall> findByNum();
    //条件查询
    public abstract List<Goodsall> findByTj(@Param("goodsName") String goodsName);
}
