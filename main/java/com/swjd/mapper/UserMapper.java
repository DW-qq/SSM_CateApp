package com.swjd.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    //新增
    public abstract int addUser(@Param("user") User user);
    //修改
    public abstract int updateUser(@Param("user") User user,@Param("uid") int uid);

}
