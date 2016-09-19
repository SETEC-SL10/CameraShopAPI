package com.setec_ecomerce.repository.users.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.PageForm;
import com.setec_ecomerce.repository.users.dto.CustomerBackEnd;

@Repository
public interface CustomerBackEndDAO {

	String C_CustomerBackEnd = "{call \"insertToCustomerBackEnd\"("
							    //OUT customer_ids integer,
							    + "#{customer_last_name},"
							    + "#{customer_first_name},"
							    + "#{customer_address},"
							    + "#{customer_phone},"
							    + "#{customer_email},"
							    + "#{customer_status})}";
	
	String U_CustomerBackEnd = "{call \"updateToCustomerBackEnd\"("
								+ "#{customer_id},"
							    + "#{customer_last_name},"
							    + "#{customer_first_name},"
							    + "#{customer_address},"
							    + "#{customer_phone},"
							    + "#{customer_email},"
							    + "#{customer_status})}";
	
	String D_CustomerBackEnd = "UPDATE table_customer_back_end SET customer_status = false WHERE customer_id = #{customer_id}";
	
	
	String F_CustomerBackEndID = "SELECT customer_id, customer_last_name, customer_first_name, customer_email, customer_phone, customer_address, customer_register_date, customer_status FROM table_customer_back_end WHERE customer_id = #{customer_id}";
	
	String F_CustomerBackEndAll = "SELECT customer_id, customer_last_name, customer_first_name, customer_email, customer_phone, customer_address, customer_register_date, customer_status FROM table_customer_back_end LIMIT #{limit} OFFSET #{page} * #{limit}";
	
	
	@Select(C_CustomerBackEnd)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "customer_id", column = "customer_ids"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_status", column = "customer_status")
	})
	CustomerBackEnd insertCustomerBackEnd(CustomerBackEnd customer);
	
	@Select(U_CustomerBackEnd)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "customer_id", column = "customer_ids"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_status", column = "customer_status")
	})
	CustomerBackEnd updateCustomerBackEnd(CustomerBackEnd customer);
	
	@Update(D_CustomerBackEnd)
	boolean deleteCustomerBackEnd(int customer_id);
	
	@Select(F_CustomerBackEndID)
	@Results({
		@Result(property = "customer_id", column = "customer_id"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_status", column = "customer_status")
	})
	CustomerBackEnd findByIDCustomerBackEnd(int customer_id);
	
	@Select(F_CustomerBackEndAll)
	@Results({
		@Result(property = "customer_id", column = "customer_id"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_status", column = "customer_status")
	})
	ArrayList<CustomerBackEnd> findAllCustomerBackEnd(PageForm page);
}
