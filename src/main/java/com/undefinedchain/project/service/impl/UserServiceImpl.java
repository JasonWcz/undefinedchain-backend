package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.dao.UserMapper;
import com.undefinedchain.project.model.User;
import com.undefinedchain.project.service.UserService;
import com.undefinedchain.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
