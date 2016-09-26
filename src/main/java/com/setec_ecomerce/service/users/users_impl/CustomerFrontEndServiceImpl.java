package com.setec_ecomerce.service.users.users_impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.users.dao.CustomerFrontEndDAO;
import com.setec_ecomerce.repository.users.dto.CustomerFrontEnd;
import com.setec_ecomerce.service.users.CustomerFrontEndService;

@Service
public class CustomerFrontEndServiceImpl implements CustomerFrontEndService{

	@Autowired 
	private CustomerFrontEndDAO customerDao;
	@Override
	public CustomerFrontEnd createCustomerFrontEnd(CustomerFrontEnd customer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomerFrontEnd(customer);
	}

	@Override
	public CustomerFrontEnd updateCustomerFrontEnd(CustomerFrontEnd customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomerFrontEnd(customer);
	}

	@Override
	public boolean deleteCustomerFrontEnd(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerFrontEnd(id);
	}

	@Override
	public CustomerFrontEnd findCustomerFrontEnd(int id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerFrontEnd(id);
	}

	@Override
	public ArrayList<CustomerFrontEnd> getAllCustomerFrontEnd() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomerFrontEnd();
	}

	@Override
	public CustomerFrontEnd CustomerFrontEndLogin(CustomerFrontEnd customer) {
		// TODO Auto-generated method stub
		return customerDao.CustomerFrontEndLogin(customer);
	}

}
