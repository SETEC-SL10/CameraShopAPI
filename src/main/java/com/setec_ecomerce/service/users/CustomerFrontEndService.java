package com.setec_ecomerce.service.users;

import java.util.ArrayList;

import com.setec_ecomerce.repository.users.dto.CustomerFrontEnd;

public interface CustomerFrontEndService {
	CustomerFrontEnd createCustomerFrontEnd(CustomerFrontEnd customer);
	CustomerFrontEnd updateCustomerFrontEnd(CustomerFrontEnd customer);
	boolean deleteCustomerFrontEnd(int id);
	CustomerFrontEnd findCustomerFrontEnd(int id);
	ArrayList<CustomerFrontEnd>  getAllCustomerFrontEnd();
	CustomerFrontEnd CustomerFrontEndLogin(CustomerFrontEnd customer);
}
