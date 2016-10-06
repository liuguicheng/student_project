package com.x.redis.dao;

import com.x.redis.obj.User;

public interface UserDao {

	  public void saveUser(final User user);
	  public User getUser(final long id);
}
