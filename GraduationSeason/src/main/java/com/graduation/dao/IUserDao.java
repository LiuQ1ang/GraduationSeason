package com.graduation.dao;

import com.graduation.pojo.User;

public interface IUserDao {
	User selectByPrimaryKey(int userId);
}
