package com.common.dao;

import com.common.po.User;

public interface UserDao {
	public int addUser(User user);

	public User getUser(int id);

}
