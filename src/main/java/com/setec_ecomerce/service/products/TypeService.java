package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.type.Type;

public interface TypeService {
	
	Type findType(int id);
	ArrayList<Type> getAllType();
	
}
