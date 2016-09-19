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
import com.setec_ecomerce.repository.users.dto.Staff;

@Repository
public interface StaffDAO {

	String C_Staff = "{call \"insertToStaff\"("
				    //OUT staff_ids integer,
				    + "#{staff_name},"
				    + "#{position},"
				    + "#{salary},"
				    + "#{phone},"
				    + "#{status})}";
	
	String U_Staff = "{call \"updateToStaff\"("
					+ "#{staff_id},"
				    + "#{staff_name},"
				    + "#{position},"
				    + "#{salary},"
				    + "#{phone},"
				    + "#{status})}";
	
	String D_Staff = "UPDATE table_staff SET status = false WHERE staff_id = #{staff_id}";
	
	String F_ID_Staff = "SELECT staff_id, staff_name, position, salary, phone, status FROM table_staff WHERE staff_id = #{staff_id}";
	
	String F_A_Staff = "SELECT staff_id, staff_name, position, salary, phone, status FROM table_staff LIMIT #{limit} OFFSET #{page} * #{limit}";
	
	@Select(C_Staff)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "staff_id", column = "staff_ids"),
		@Result(property = "staff_name", column = "staff_name"),
		@Result(property = "position", column = "positions"),
		@Result(property = "salary", column = "salary"),
		@Result(property = "phone", column = "phone"),
		@Result(property = "status", column = "status")
	})
	Staff insertStaff(Staff staff);
	
	@Select(U_Staff)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "staff_id", column = "staff_ids"),
		@Result(property = "staff_name", column = "staff_name"),
		@Result(property = "position", column = "positions"),
		@Result(property = "salary", column = "salary"),
		@Result(property = "phone", column = "phone"),
		@Result(property = "status", column = "status")
	})
	Staff updateStaff(Staff staff);
	
	@Update(U_Staff)
	boolean deleteStaff(int staff_id);
	
	@Select(F_ID_Staff)
	@Results({
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "staff_name", column = "staff_name"),
		@Result(property = "position", column = "position"),
		@Result(property = "salary", column = "salary"),
		@Result(property = "phone", column = "phone"),
		@Result(property = "status", column = "status")
	})
	Staff findByIDStaff(int staff_id);
	
	@Select(F_A_Staff)
	@Results({
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "staff_name", column = "staff_name"),
		@Result(property = "position", column = "position"),
		@Result(property = "salary", column = "salary"),
		@Result(property = "phone", column = "phone"),
		@Result(property = "status", column = "status")
	})
	ArrayList<Staff> findAllStaff(PageForm page);
}
