package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swjd.bean.Cake;
import com.swjd.bean.Grang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CakeMapper extends BaseMapper<Cake> {
    //查询
    public abstract List<Cake> findAll(@Param("page") Integer page,@Param("rows") Integer rows);

    //分页查询
    public abstract Page<Cake> queryFenYe(Page page);

    //根据id单个查询
    public abstract Cake findById(int id);


}
