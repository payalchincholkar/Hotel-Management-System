package com.receptionistmanagement.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payment")
public class PaymentEntity {
private int orderId;
private int amount;
private String paymentStatus;
private String taxId;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}
public String getTaxId() {
	return taxId;
}
public void setTaxId(String taxId) {
	this.taxId = taxId;
}
@Override
public String toString() {
	return "PayamentEntity [orderId=" + orderId + ", amount=" + amount + ", paymentStatus=" + paymentStatus + ", taxId="
			+ taxId + "]";
}
public PaymentEntity() {
	super();
	
}
public PaymentEntity(int orderId, int amount, String paymentStatus, String taxId) {
	super();
	this.orderId = orderId;
	this.amount = amount;
	this.paymentStatus = paymentStatus;
	this.taxId = taxId;
}



}
