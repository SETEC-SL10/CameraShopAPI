package com.setec_ecomerce.service.back_end_transaction.products_import;

import com.setec_ecomerce.repository.back_end_transaction.products_import.dto.old_accessory.AccessoryOldImportForm;

public interface AccessoryOldImportFormService {
	boolean insertToAccessoryOldImportForm(AccessoryOldImportForm importForm);
}
