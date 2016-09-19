package com.setec_ecomerce.service.products.product_impl.type;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.type.TypeDAO;
import com.setec_ecomerce.repository.products.dto.type.Type;
import com.setec_ecomerce.service.products.TypeService;

@Service
public class TypeServiceImpl implements TypeService{

	@Autowired
	private TypeDAO typeDao;
	@Override
	public Type findType(int id) {
		return typeDao.findType(id);
	}

	@Override
	public ArrayList<Type> getAllType() {
		return typeDao.getAllType();
	}

}
