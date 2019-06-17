package com.hcl.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class OrderPlaced {
	
	@Entity
	@Table(name = "orderplace")
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer orderId;
		private String orderDate;
		private Integer userId;
		private String orderStatus;
		private String comment;
		/**
		 * @return the orderId
		 */
		public Integer getOrderId() {
			return orderId;
		}
		/**
		 * @param orderId the orderId to set
		 */
		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}
		/**
		 * @return the orderDate
		 */
		public String getOrderDate() {
			return orderDate;
		}
		/**
		 * @param orderDate the orderDate to set
		 */
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
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
		 * @return the orderStatus
		 */
		public String getOrderStatus() {
			return orderStatus;
		}
		/**
		 * @param orderStatus the orderStatus to set
		 */
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		/**
		 * @return the comment
		 */
		public String getComment() {
			return comment;
		}
		/**
		 * @param comment the comment to set
		 */
		public void setComment(String comment) {
			this.comment = comment;
		}
		
		

}
}
