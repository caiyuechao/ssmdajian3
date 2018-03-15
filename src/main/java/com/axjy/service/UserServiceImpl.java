package com.axjy.service;

import com.axjy.mapper.UserMapper;
import com.axjy.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/3/14.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
     private UserMapper userMapper;
    @Override
    @Transactional(readOnly = true)
    public User login(String userCode, String userPassword) {
        User user=userMapper.find(userCode,userPassword);
        return user;
    }
}
