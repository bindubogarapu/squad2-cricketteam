package com.hcl.shoppingcart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	
	@Entity
	@Table(name = "ShoppingCartDetails")
	public class ShoppingCartDetails {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer shoppingId;
		private Integer userId;
	//private Integer productId;
		private String shoppingDate;
		private String status;
		/**
		 * @return the productlist
		 */
		public List<Product> getProductlist() {
			return productlist;
		}
		/**
		 * @param productlist the productlist to set
		 */
		public void setProductlist(List<Product> productlist) {
			this.productlist = productlist;
		}
		@OneToMany
		@JoinColumn(name="productId")
		private List<Product> productlist;
		
		
		
		/**
		 * @return the shoppingId
		 */
		public Integer getShoppingId() {
			return shoppingId;
		}
		/**
		 * @param shoppingId the shoppingId to set
		 */
		public void setShoppingId(Integer shoppingId) {
			this.shoppingId = shoppingId;
		}
		/**
		 * @return the userId
		 */
		public Integer getUserId() {
			return userId;
		}
		/**
		 * @param userId the userId to set
		 */
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		
		/**
		 * @return the shoppingDate
		 */
		public String getShoppingDate() {
			return shoppingDate;
		}
		/**
		 * @param shoppingDate the shoppingDate to set
		 */
		public void setShoppingDate(String shoppingDate) {
			this.shoppingDate = shoppingDate;
		}
		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}
		
	}
	
