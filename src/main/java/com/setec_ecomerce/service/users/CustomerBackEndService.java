package com.setec_ecomerce.service.users;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dto.CustomerBackEnd;

public interface CustomerBackEndService {

	CustomerBackEnd insertCustomerBackEnd(CustomerBackEnd customer);
	CustomerBackEnd updateCustomerBackEnd(CustomerBackEnd customer);
	boolean deleteCustomerBackEnd(int customer_id);
	CustomerBackEnd findByIDCustomerBackEnd(int customer_id);
	ArrayList<CustomerBackEnd> findAllCustomerBackEnd(PageForm page);
	
}
