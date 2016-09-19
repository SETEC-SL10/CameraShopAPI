package com.setec_ecomerce.service.users;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dto.Staff;

public interface StaffService {

	Staff insertStaff(Staff staff);
	Staff updateStaff(Staff staff);
	boolean deleteStaff(int staff_id);
	Staff findByIDStaff(int staff_id);
	ArrayList<Staff> findAllStaff(PageForm page);
	
}
