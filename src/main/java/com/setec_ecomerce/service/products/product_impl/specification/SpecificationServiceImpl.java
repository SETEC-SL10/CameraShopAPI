package com.setec_ecomerce.service.products.product_impl.specification;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.specification.SpecificationDAO;
import com.setec_ecomerce.repository.products.dto.specification.Specification;
import com.setec_ecomerce.service.products.SpecificationService;

@Service
public class SpecificationServiceImpl implements SpecificationService{

	@Autowired
	private SpecificationDAO specificationDAO;
	@Override
	public Specification createSpecification(Specification spec) {
		// TODO Auto-generated method stub
		return specificationDAO.createSpecification(spec);
	}

	@Override
	public Specification updateSpecification(Specification spec) {
		// TODO Auto-generated method stub
		return specificationDAO.updateSpecification(spec);
	}

	@Override
	public boolean deleteSpecification(int id) {
		// TODO Auto-generated method stub
		return specificationDAO.deleteSpecification(id);
	}

	@Override
	public Specification findSpecification(int id) {
		// TODO Auto-generated method stub
		return specificationDAO.findSpecification(id);
	}

	@Override
	public ArrayList<Specification> getSpecificationByPro_ID(String pro_id) {
		// TODO Auto-generated method stub
		return specificationDAO.getSpecificationByPro_ID(pro_id);
	}

}
