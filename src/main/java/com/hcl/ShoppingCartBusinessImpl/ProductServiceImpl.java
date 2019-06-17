package com.hcl.ShoppingCartBusinessImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ShoppingCartIBusiness.ProductIService;
import com.hcl.shoppingcart.dao.ICartDAO;
import com.hcl.shoppingcart.dao.IProductDAO;
import com.hcl.shoppingcart.entity.Product;

@Service
public class ProductServiceImpl implements ProductIService{
	@Autowired
	IProductDAO productDAO;
	
	@Autowired
	ICartDAO cartDAO;
	
	public List<Product> getProductsByProductName(String productName)
	{
		return productDAO.getProductListByProductName(productName);
	}

	@Override
	public Product addToCart(Product cart) {
		// TODO Auto-generated method stub
		
		return productDAO.save(cart);
		
	}

	
	
	
}
