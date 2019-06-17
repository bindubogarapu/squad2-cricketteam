package com.hcl.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ShoppingCartIBusiness.CartIService;
import com.hcl.ShoppingCartIBusiness.ProductIService;
import com.hcl.shoppingcart.entity.Product;
import com.hcl.shoppingcart.entity.ShoppingCartDetails;


@RestController
public class ShoppingCartController {
	
@Autowired
ProductIService productService;
@Autowired
CartIService cartIService;


	@GetMapping(value = "/products/{productName}")
	public List<Product> getProducts(@PathVariable String productName) {
		List<Product> productList = productService.getProductsByProductName(productName);
		System.out.println(productList.size()+"======>>>===============productName=================");
		return productList;
	}
	
	@PostMapping(value = "/shoppingcart")
	public String addProductsToBag( @RequestBody ShoppingCartDetails product) {
		cartIService.addToCart(product);
		return "OK";
	}
	
	
	@GetMapping(value = "/hi")
	public String nullTest() {
		String str = null;
		int length = str.length();
		return "Success";
	}
	
	}
