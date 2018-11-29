package com.example.mybatis_spring.mapper;

import com.example.mybatis_spring.pojo.User;

public interface UserMapper {
	User findUserById(Integer id);
}
