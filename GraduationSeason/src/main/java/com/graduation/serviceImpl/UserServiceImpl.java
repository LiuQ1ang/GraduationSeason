package com.graduation.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.graduation.dao.IUserDao;
import com.graduation.pojo.User;
import com.graduation.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}
