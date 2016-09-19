package com.setec_ecomerce.service.users;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dto.User;

public interface UserService {

	User insertUser(User user);
	User updateUser(User user);
	boolean deleteUser(int user_id);
	User findByIDUser(int user_id);
	ArrayList<User> findAllUser(PageForm page);
	
}
