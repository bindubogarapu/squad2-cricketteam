package com.hcl.shoppingcart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.shoppingcart.entity.Product;
@Repository
public interface IProductDAO extends JpaRepository<Product,String> {

	@Query("Select c from Product c where c.productName like %:productName%")
	public List<Product> getProductListByProductName(@Param("productName") String productName);
	
	
	public List<Product> findByProductName(String productName);
	
}
