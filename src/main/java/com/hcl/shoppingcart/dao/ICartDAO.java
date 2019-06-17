package com.hcl.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.shoppingcart.entity.ShoppingCartDetails;
@Repository
public interface ICartDAO extends JpaRepository<ShoppingCartDetails,String> {

	
	
}
