package com.setec_ecomerce.repository.users.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.users.dto.CustomerFrontEnd;

@Repository
public interface CustomerFrontEndDAO {

	String C_Customer = "{ call \"insertToCustomerFrontEnd\"("
						//OUT cus_id integer,
						+"#{customer_last_name},"
					    +"#{customer_first_name},"
					    +"#{customer_address},"
					    +"#{customer_phone},"
					    +"#{customer_email},"
					    +"#{customer_password},"
					    +"#{customer_status})}";
	
	String U_Customer = "{ call \"updateToCustomerFrontEnd\"("
						+"#{customer_id},"
						+"#{customer_last_name},"
					    +"#{customer_first_name},"
					    +"#{customer_address},"
					    +"#{customer_phone},"
					    +"#{customer_email},"
					    +"#{customer_password},"
					    +"#{customer_status})}";
	
	String D_Customer = "UPDATE table_customer_front_end SET customer_status = false WHERE customer_id = #{id}";
	
	String F_Customer = "SELECT customer_id, customer_last_name, customer_first_name, customer_email, customer_phone, customer_address, customer_password, customer_status FROM table_customer_front_end WHERE customer_id = #{id} AND customer_status = true";
	
	String F_CustomerByLogin = "SELECT customer_id, customer_last_name, customer_first_name, customer_email, customer_phone, customer_address, customer_password, customer_status FROM table_customer_front_end WHERE customer_email = #{customer_email} AND customer_password = #{customer_password} AND customer_status = true";

	
	String F_A_Customer = "SELECT customer_id, customer_last_name, customer_first_name, customer_email, customer_phone, customer_address, customer_password, customer_status FROM table_customer_front_end WHERE customer_status = true";
 
	String Check_Customer = "select exists(SELECT customer_id from table_customer_front_end WHERE customer_id = #{id})";

	@Select(C_Customer)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "customer_id", column = "cus_id"),
		@Result(property = "customer_last_name", column = "last_name"),
		@Result(property = "customer_first_name", column = "first_name"),
		@Result(property = "customer_address", column = "address"),
		@Result(property = "customer_phone", column = "phone"),
		@Result(property = "customer_email", column = "email"),
		@Result(property = "customer_password", column = "passwd"),
		@Result(property = "customer_status", column = "status")
	})
	CustomerFrontEnd createCustomerFrontEnd(CustomerFrontEnd customer);
	
	@Select(U_Customer)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "customer_id", column = "cus_id"),
		@Result(property = "customer_last_name", column = "last_name"),
		@Result(property = "customer_first_name", column = "first_name"),
		@Result(property = "customer_address", column = "address"),
		@Result(property = "customer_phone", column = "phone"),
		@Result(property = "customer_email", column = "email"),
		@Result(property = "customer_password", column = "passwd"),
		@Result(property = "customer_status", column = "status")
	})
	CustomerFrontEnd updateCustomerFrontEnd(CustomerFrontEnd customer);
	
	@Update(D_Customer)
	boolean deleteCustomerFrontEnd(int id);
	
	@Select(Check_Customer)
	boolean checkCustomerFrontEnd(int id);
	
	@Select(F_Customer)
	@Results({
		@Result(property = "customer_id", column = "customer_id"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_password", column = "customer_password"),
		@Result(property = "customer_status", column = "customer_status")
	})
	CustomerFrontEnd findCustomerFrontEnd(int id);
	
	@Select(F_A_Customer)
	@Results({
		@Result(property = "customer_id", column = "customer_id"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_password", column = "customer_password"),
		@Result(property = "customer_status", column = "customer_status")
	})
	ArrayList<CustomerFrontEnd>  getAllCustomerFrontEnd();
	
	@Select(F_CustomerByLogin)
	@Results({
		@Result(property = "customer_id", column = "customer_id"),
		@Result(property = "customer_last_name", column = "customer_last_name"),
		@Result(property = "customer_first_name", column = "customer_first_name"),
		@Result(property = "customer_address", column = "customer_address"),
		@Result(property = "customer_phone", column = "customer_phone"),
		@Result(property = "customer_email", column = "customer_email"),
		@Result(property = "customer_password", column = "customer_password"),
		@Result(property = "customer_status", column = "customer_status")
	})
	CustomerFrontEnd CustomerFrontEndLogin(CustomerFrontEnd customer);
}
