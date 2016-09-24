package com.setec_ecomerce.restcontroller.front_end_transaction;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.products.dto.ProductFormDetail;
import com.setec_ecomerce.repository.products.dto.products_form.ProductForm;
import com.setec_ecomerce.repository.utils.Utils;
import com.setec_ecomerce.service.products.NewCameraService;
import com.setec_ecomerce.service.products.ProductFormDetailService;
import com.setec_ecomerce.service.products.ProductsFormService;

@RestController
@RequestMapping("api/products/product-form")
public class ProductsController {

	@Autowired
	private ProductsFormService productService;
	
	@Autowired
	private ProductFormDetailService productDetailService;
	
	@RequestMapping(value="/newCameraForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findNewCameraForm(@RequestBody PageForm page){
		ArrayList<ProductForm> newCameraForm = productService.getAllCameraNewForm(page);
		if( newCameraForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(newCameraForm.size() > 0){
				return Utils.respondJson("Record found", newCameraForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/newCameraForm/page",method=RequestMethod.POST)
	public int countPageNewCameraForm(@RequestBody PageForm page){
		return productService.countPageCameraNewForm(page);
	}
	
	@RequestMapping(value="/oldCameraForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findOldCameraForm(@RequestBody PageForm page){
		ArrayList<ProductForm> oldCameraForm = productService.getAllCameraOldForm(page);
		if( oldCameraForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(oldCameraForm.size() > 0){
				return Utils.respondJson("Record found", oldCameraForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/oldCameraForm/page",method=RequestMethod.POST)
	public int countPageOldCameraForm(@RequestBody PageForm page){
		return productService.countPageCameraOldForm(page);
	}
	
	@RequestMapping(value="/newAccessoryForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findNewAccessoryForm(@RequestBody PageForm page){
		ArrayList<ProductForm> newAccessoryForm = productService.getAllAccessoryNewForm(page);
		if( newAccessoryForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(newAccessoryForm.size() > 0){
				return Utils.respondJson("Record found", newAccessoryForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/newAccessoryForm/page",method=RequestMethod.POST)
	public int countPageNewAccessoryForm(@RequestBody PageForm page){
		return productService.countPageAccessoryNewForm(page);
	}
	
	@RequestMapping(value="/oldAccessoryForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findOldAccessoryForm(@RequestBody PageForm page){
		ArrayList<ProductForm> oldAccessoryForm = productService.getAllAccessoryOldForm(page);
		if( oldAccessoryForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(oldAccessoryForm.size() > 0){
				return Utils.respondJson("Record found", oldAccessoryForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/oldAccessoryForm/page",method=RequestMethod.POST)
	public int countPageOldAccessoryForm(@RequestBody PageForm page){
		return productService.countPageAccessoryOldForm(page);
	}
	
	@RequestMapping(value="/ProductForms",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findProductForms(@RequestBody PageForm page){
		ArrayList<ProductForm> productForm = productService.getAllProductForm(page);
		if( productForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(productForm.size() > 0){
				return Utils.respondJson("Record found", productForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/ProductForm",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findProductForm(@RequestBody ProductForm product){
		ArrayList<ProductForm> productForm = productService.getProductForm(product);
		if( productForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(productForm.size() > 0){
				return Utils.respondJson("Record found", productForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/ProductFormRelated",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findProductFormRelated(@RequestBody ProductForm product){
		ArrayList<ProductForm> productForm = productService.getProductFormRelated(product);
		if( productForm == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(productForm.size() > 0){
				return Utils.respondJson("Record found", productForm, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/ProductFormDetail",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findProductFormDetail(@RequestBody ProductForm product){
		ArrayList<ProductFormDetail> productFormDetail = productDetailService.getProductDetail(product);
		if( productFormDetail == null ){
			return Utils.respondJson("Record not found", null, HttpStatus.OK);
		}else{
			if(productFormDetail.size() > 0){
				return Utils.respondJson("Record found", productFormDetail, HttpStatus.OK);
			}else{
				return Utils.respondJson("Record not found", null, HttpStatus.OK);
			}
		}
	}
	
	@RequestMapping(value="/ProductForm/page",method=RequestMethod.POST)
	public int countPageProductForm(@RequestBody PageForm page){
		return productService.countPageProductForm(page);
	}
}
