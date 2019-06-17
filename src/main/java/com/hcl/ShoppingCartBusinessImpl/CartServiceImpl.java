package com.hcl.ShoppingCartBusinessImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ShoppingCartIBusiness.CartIService;
import com.hcl.shoppingcart.dao.ICartDAO;
import com.hcl.shoppingcart.entity.ShoppingCartDetails;

@Service
public class CartServiceImpl implements CartIService{
	
	@Autowired
	ICartDAO cartDAO;
	
	

	@Override
	public ShoppingCartDetails addToCart(ShoppingCartDetails cart) {
		// TODO Auto-generated method stub
		
		return cartDAO.save(cart);
		
	}

	
	
	
}
