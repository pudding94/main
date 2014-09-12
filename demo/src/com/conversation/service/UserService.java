package com.conversation.service;

import com.common.po.User;

public interface UserService {
	public int addUser(User user);

	public User getUser(int id);
}
