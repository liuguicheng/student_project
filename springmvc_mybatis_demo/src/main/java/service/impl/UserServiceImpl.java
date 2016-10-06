package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.user;
import dao.userMapper;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private userMapper iuserMapper;
	@Override
	public List<user> getUserList() {
		// TODO Auto-generated method stub
		return iuserMapper.selectAll();
	}

}
