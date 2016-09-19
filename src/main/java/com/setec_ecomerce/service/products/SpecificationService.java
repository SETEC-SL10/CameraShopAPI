package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.specification.Specification;

public interface SpecificationService {
	Specification createSpecification(Specification spec);
	Specification updateSpecification(Specification spec);
	boolean deleteSpecification(int id);
	Specification findSpecification(int id);
	ArrayList<Specification> getSpecificationByPro_ID(String pro_id);
}
