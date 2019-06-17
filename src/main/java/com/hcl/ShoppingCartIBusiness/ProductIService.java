package com.hcl.ShoppingCartIBusiness;

import java.util.List;

import com.hcl.shoppingcart.entity.Product;

public interface ProductIService {
	
	public List<Product> getProductsByProductName (String prodName);
	
	public Product addToCart(Product cart);

}
