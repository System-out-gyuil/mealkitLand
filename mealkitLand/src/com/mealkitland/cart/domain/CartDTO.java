package com.mealkitland.cart.domain;

import java.util.Objects;

public class CartDTO {

	private Long productId;
	private String productName;
	private int productPrice;
	private String productTypeDate;
	private int subscribeCount;
	
	public CartDTO() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductTypeDate() {
		return productTypeDate;
	}

	public void setProductTypeDate(String productTypeDate) {
		this.productTypeDate = productTypeDate;
	}



	public int getSubscribeCount() {
		return subscribeCount;
	}

	public void setSubscribeCount(int subscribeCount) {
		this.subscribeCount = subscribeCount;
	}



	@Override
	public String toString() {
		return "CartDTO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productTypeDate=" + productTypeDate + ", subscribeCount=" + subscribeCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartDTO other = (CartDTO) obj;
		return Objects.equals(productId, other.productId);
	}
	
	
	
	
	
	
}
