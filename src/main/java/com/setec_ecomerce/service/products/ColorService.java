package com.setec_ecomerce.service.products;

import java.util.ArrayList;

import com.setec_ecomerce.repository.products.dto.color.Color;

public interface ColorService {
	Color insertColor(Color color);
	Color updateColor(Color color);
	boolean deletColor(int id);
	Color findColor(int id);
	ArrayList<Color> findColors();
}
