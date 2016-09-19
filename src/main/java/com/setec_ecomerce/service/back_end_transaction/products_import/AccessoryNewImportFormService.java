package com.setec_ecomerce.service.back_end_transaction.products_import;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.new_accessory.AccessoryNewImportForm;

public interface AccessoryNewImportFormService {
	
	boolean insertAccessoryNewImportForm(AccessoryNewImportForm importForm);
	
}
