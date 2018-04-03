package com.hxsmart.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hxsmart.ssm.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    User selectByUserName(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
