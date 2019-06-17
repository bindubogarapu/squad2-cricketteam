package com.hcl.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String productDescription;
	private String productCode;
	private Integer price;
	private Integer qty;
	/**
	 * @return the cart
	 */
	public ShoppingCartDetails getCart() {
		return cart;
	}
	/**
	 * @param cart the cart to set
	 */
	public void setCart(ShoppingCartDetails cart) {
		this.cart = cart;
	}
	@ManyToOne
	private ShoppingCartDetails cart;
	
//	/**
//	 * @return the cart
//	 */
//	public List<ShoppingCartDetails> getCart() {
//		return cart;
//	}
//	/**
//	 * @param cart the cart to set
//	 */
//	public void setCart(List<ShoppingCartDetails> cart) {
//		this.cart = cart;
//	}
	/**
	 * @return the qty
	 */
	public Integer getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	/**
	 * @return the availability
	 */
	public Integer getAvailability() {
		return availability;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(Integer availability) {
		this.availability = availability;
	}
	private Integer availability;
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	

}
