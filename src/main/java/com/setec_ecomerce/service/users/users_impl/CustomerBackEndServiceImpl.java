package com.setec_ecomerce.service.users.users_impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dao.CustomerBackEndDAO;
import com.setec_ecomerce.repository.users.dto.CustomerBackEnd;
import com.setec_ecomerce.service.users.CustomerBackEndService;

@Service
public class CustomerBackEndServiceImpl implements CustomerBackEndService{

	@Autowired
	private CustomerBackEndDAO customerBackEndDao;

	@Override
	public CustomerBackEnd insertCustomerBackEnd(CustomerBackEnd customer) {
		// TODO Auto-generated method stub
		return customerBackEndDao.insertCustomerBackEnd(customer);
	}

	@Override
	public CustomerBackEnd updateCustomerBackEnd(CustomerBackEnd customer) {
		// TODO Auto-generated method stub
		return customerBackEndDao.updateCustomerBackEnd(customer);
	}

	@Override
	public boolean deleteCustomerBackEnd(int customer_id) {
		// TODO Auto-generated method stub
		return customerBackEndDao.deleteCustomerBackEnd(customer_id);
	}

	@Override
	public CustomerBackEnd findByIDCustomerBackEnd(int customer_id) {
		// TODO Auto-generated method stub
		return customerBackEndDao.findByIDCustomerBackEnd(customer_id);
	}

	@Override
	public ArrayList<CustomerBackEnd> findAllCustomerBackEnd(PageForm page) {
		// TODO Auto-generated method stub
		return customerBackEndDao.findAllCustomerBackEnd(page);
	}
	
}
