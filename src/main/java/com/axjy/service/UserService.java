package com.axjy.service;

import com.axjy.pojo.User;

/**
 * Created by lenovo on 2018/3/14.
 */
public interface UserService {
    User login(String userCode,String userPassword);

}
