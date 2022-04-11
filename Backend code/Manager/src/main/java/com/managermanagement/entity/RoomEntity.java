package com.managermanagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roomService")
public class RoomEntity {
	@Id
private int rNumber;
private String rType;
private String rStatus;
private Double rPrice;
public int getrNumber() {
	return rNumber;
}
public void setrNumber(int rNumber) {
	this.rNumber = rNumber;
}
public String getrType() {
	return rType;
}
public void setrType(String rType) {
	this.rType = rType;
}
public String getrStatus() {
	return rStatus;
}
public void setrStatus(String rStatus) {
	this.rStatus = rStatus;
}
public Double getrPrice() {
	return rPrice;
}
public void setrPrice(Double rPrice) {
	this.rPrice = rPrice;
}
public RoomEntity(int rNumber, String rType, String rStatus, Double rPrice) {
	super();
	this.rNumber = rNumber;
	this.rType = rType;
	this.rStatus = rStatus;
	this.rPrice = rPrice;
}
public RoomEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
