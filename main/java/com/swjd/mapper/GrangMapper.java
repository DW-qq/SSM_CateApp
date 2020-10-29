package com.swjd.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swjd.bean.Cake;
import com.swjd.bean.Grang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GrangMapper extends BaseMapper<Grang> {
    //查询
    public abstract List<Grang> findAll(@Param("page") Integer page,@Param("rows") Integer rows);

    //分页查询
    public abstract Page<Grang> queryFenYe(Page page);

    //根据id单个查询
    public abstract Grang findById(int id);

}
