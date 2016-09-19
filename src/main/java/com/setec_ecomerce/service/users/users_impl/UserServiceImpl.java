package com.setec_ecomerce.service.users.users_impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dao.UserDAO;
import com.setec_ecomerce.repository.users.dto.User;
import com.setec_ecomerce.service.users.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;

	@Override
	public User insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int user_id) {
		return userDao.deleteUser(user_id);
	}

	@Override
	public User findByIDUser(int user_id) {
		return userDao.findByIDUser(user_id);
	}

	@Override
	public ArrayList<User> findAllUser(PageForm page) {
		return userDao.findAllUser(page);
	}
	
}
