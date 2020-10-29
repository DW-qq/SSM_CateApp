package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService extends IService<User> {
    //新增
    public abstract int addUser(User user);
    //修改
    public abstract int updateUser( User user,int uid);
}
