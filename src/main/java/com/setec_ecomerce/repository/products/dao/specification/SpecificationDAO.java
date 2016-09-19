package com.setec_ecomerce.repository.products.dao.specification;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.setec_ecomerce.repository.products.dto.specification.Specification;

@Repository
public interface SpecificationDAO {
	
	String C_Spec = "{ call \"insertToSpecification\"("
					//OUT specification_ids integer,
					+ "#{product_id},"
					+ "#{specification_name},"
				    + "#{description},"
				    + "#{status})}";
	
	String U_Spec = "{ call \"updateToSpecification\"("
			+ "#{specification_id},"
			+ "#{product_id},"
			+ "#{specification_name},"
		    + "#{description},"
		    + "#{status})}";
	
	String D_Spec = "UPDATE table_specification SET status = false WHERE specification_id = #{id}";
	
	String F_Spec = "SELECT product_id, specification_id, specification_name, description,  status FROM table_specification WHERE specification_id = #{id} AND status = true";
	
	String F_A_Spec = "SELECT product_id, specification_id, specification_name, description,  status FROM table_specification WHERE product_id = #{pro_id} AND status = true";
	
	@Select(C_Spec)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "specification_id", column = "specification_ids"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "specification_name", column = "specification_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "status", column = "status")
	})
	Specification createSpecification(Specification spec);
	
	
	@Select(U_Spec)
	@Options(statementType = StatementType.CALLABLE)
	@Results({
		@Result(property = "specification_id", column = "specification_ids"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "specification_name", column = "specification_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "status", column = "status")
	})
	Specification updateSpecification(Specification spec);
	
	
	@Update(D_Spec)
	boolean deleteSpecification(int id);
	
	
	@Select(F_Spec)
	@Results({
		@Result(property = "specification_id", column = "specification_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "specification_name", column = "specification_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "status", column = "status")
	})
	Specification findSpecification(int id);
	
	
	@Select(F_A_Spec)
	@Results({
		@Result(property = "specification_id", column = "specification_id"),
		@Result(property = "product_id", column = "product_id"),
		@Result(property = "specification_name", column = "specification_name"),
		@Result(property = "description", column = "description"),
		@Result(property = "status", column = "status")
	})
	ArrayList<Specification> getSpecificationByPro_ID(String pro_id);
}
