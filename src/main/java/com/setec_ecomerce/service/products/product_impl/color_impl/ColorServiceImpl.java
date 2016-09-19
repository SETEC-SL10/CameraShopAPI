package com.setec_ecomerce.service.products.product_impl.color_impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec_ecomerce.repository.products.dao.color.ColorDAO;
import com.setec_ecomerce.repository.products.dto.color.Color;
import com.setec_ecomerce.service.products.ColorService;

@Service
public class ColorServiceImpl implements ColorService{

	
	@Autowired
	private ColorDAO colorDao;
	
	@Override
	public Color insertColor(Color color) {
		// TODO Auto-generated method stub
		return colorDao.insertColor(color);
	}

	@Override
	public Color updateColor(Color color) {
		// TODO Auto-generated method stub
		return colorDao.updateColor(color);
	}

	@Override
	public boolean deletColor(int id) {
		// TODO Auto-generated method stub
		return colorDao.deletColor(id);
	}

	@Override
	public Color findColor(int id) {
		// TODO Auto-generated method stub
		return colorDao.findColor(id);
	}

	@Override
	public ArrayList<Color> findColors() {
		// TODO Auto-generated method stub
		return colorDao.findColors();
	}

}
