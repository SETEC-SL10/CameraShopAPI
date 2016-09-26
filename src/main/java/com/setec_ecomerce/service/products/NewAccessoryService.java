package com.setec_ecomerce.service.products;

import java.util.ArrayList;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.new_accessory.NewAccessory;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;

public interface NewAccessoryService {
	NewAccessory createNewAccessory(NewAccessory newAccessory);
	NewAccessory updateNewAccessory(NewAccessory newAccessory);
	boolean deleteNewAccessory(String id);
	NewAccessory findNewAccessory(String id);
	ArrayList<NewAccessory> getAllNewAccessory(PageForm page);
	public int countPageAllNewAccessory(PageForm page);
}
