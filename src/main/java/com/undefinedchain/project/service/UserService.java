package com.undefinedchain.project.service;
import com.undefinedchain.project.model.User;
import com.undefinedchain.project.core.Service;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
public interface UserService extends Service<User> {

    User findUserByPhone(String Phone);//通过用户phone查找
}
