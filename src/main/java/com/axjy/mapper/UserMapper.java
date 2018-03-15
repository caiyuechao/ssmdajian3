package com.axjy.mapper;

import com.axjy.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lenovo on 2018/3/7.
 */
public interface UserMapper {
    User find(@Param("userCode") String userCode,@Param("userPassword") String userPassword);
}
