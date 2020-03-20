package com.undefinedchain.project.dao;

import com.undefinedchain.project.core.Mapper;
import com.undefinedchain.project.model.User;

public interface UserMapper extends Mapper<User> {
    public  User findUserByPhone(String phone);
}