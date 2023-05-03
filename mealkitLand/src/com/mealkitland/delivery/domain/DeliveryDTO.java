package com.mealkitland.delivery.domain;

public class DeliveryDTO {
	
	private String deliveryAddress;
	private String userName;
	private String userPhone;
	private String productName;
	
	public DeliveryDTO() {
		super();
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "DeliveryDTO [deliveryAddress=" + deliveryAddress + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", productName=" + productName + "]";
	}
	
	
	
	
}
