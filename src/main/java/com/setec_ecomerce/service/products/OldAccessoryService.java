package com.setec_ecomerce.service.products;

import java.util.ArrayList;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.old_accessory.OldAccessory;

public interface OldAccessoryService {
	OldAccessory createOldAccessory(OldAccessory oldAccessory);
	OldAccessory updateOldAccessory(OldAccessory oldAccessory);
	boolean deleteOldAccessory(String id);
	OldAccessory findOldAccessory(String id);
	ArrayList<OldAccessory> getAllOldAccessory(PageForm page);
	int countPageAllOldAccessory(PageForm page);
}
