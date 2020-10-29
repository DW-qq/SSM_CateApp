package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swjd.bean.Cake;
import com.swjd.bean.Wine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WineMapper extends BaseMapper<Wine> {
    //查询
    public abstract List<Wine> findAll(@Param("page") Integer page, @Param("rows") Integer rows);
    //分页查询
    public abstract Page<Wine> queryFenYe(Page page);
    //根据id单个查询
    public abstract Wine findById(int id);


}
