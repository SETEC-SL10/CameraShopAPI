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
import com.setec_ecomerce.repository.users.dto.User;

@Repository
public interface UserDAO {

	String C_User = "{ call \"insertToUser\"("
				    //OUT user_ids integer,
				    + "#{staff_id},"
				    + "#{role_id},"
				    + "#{username},"
				    + "#{password},"
				    + "#{status})}";
	
	String U_User = "{ call \"updateToUser\"("
					+ "#{user_id},"
				    + "#{staff_id},"
				    + "#{role_id},"
				    + "#{username},"
				    + "#{password},"
				    + "#{status})}";
	
	String D_User = "UPDATE table_user SET status = false WHERE user_id = #{user_id}";
	
	String F_User = "SELECT * FROM table_user WHERE user_id = #{user_id} AND status = true";
	
	String F_A_User = "SELECT * FROM table_user WHERE status = true LIMIT #{limit} OFFSET #{page} * #{limit}";
	
	@Select(C_User)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "user_id", column = "user_ids"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "role_id", column = "role_id"),
		@Result(property = "username", column = "username"),
		@Result(property = "password", column = "password"),
		@Result(property = "status", column = "status")
	})
	User insertUser(User user);
	
	@Select(U_User)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "user_id", column = "user_ids"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "role_id", column = "role_id"),
		@Result(property = "username", column = "username"),
		@Result(property = "password", column = "password"),
		@Result(property = "status", column = "status")
	})
	User updateUser(User user);
	
	@Update(D_User)
	boolean deleteUser(int user_id);
	
	@Select(F_User)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "user_id", column = "user_id"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "role_id", column = "role_id"),
		@Result(property = "username", column = "username"),
		@Result(property = "password", column = "password"),
		@Result(property = "status", column = "status")
	})
	User findByIDUser(int user_id);
	
	@Select(F_A_User)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "user_id", column = "user_id"),
		@Result(property = "staff_id", column = "staff_id"),
		@Result(property = "role_id", column = "role_id"),
		@Result(property = "username", column = "username"),
		@Result(property = "password", column = "password"),
		@Result(property = "status", column = "status")
	})
	ArrayList<User> findAllUser(PageForm page);
	
}
