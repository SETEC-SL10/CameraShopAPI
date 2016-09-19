package com.setec_ecomerce.service.users.users_impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dao.StaffDAO;
import com.setec_ecomerce.repository.users.dto.Staff;
import com.setec_ecomerce.service.users.StaffService;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	private StaffDAO staffDao;

	@Override
	public Staff insertStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffDao.insertStaff(staff);
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffDao.updateStaff(staff);
	}

	@Override
	public boolean deleteStaff(int staff_id) {
		// TODO Auto-generated method stub
		return staffDao.deleteStaff(staff_id);
	}

	@Override
	public Staff findByIDStaff(int staff_id) {
		// TODO Auto-generated method stub
		return staffDao.findByIDStaff(staff_id);
	}

	@Override
	public ArrayList<Staff> findAllStaff(PageForm page) {
		// TODO Auto-generated method stub
		return staffDao.findAllStaff(page);
	}
	
}
