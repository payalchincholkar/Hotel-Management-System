package com.owner.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "departmentManagement")
public class Details {
	@Id
	private int id;
	private String departmentName;
	private int noOfMember;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNoOfMember() {
		return noOfMember;
	}
	public void setNoOfMember(int noOfMember) {
		this.noOfMember = noOfMember;
	}
	public Details(int id, String departmentName, int noOfMember) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.noOfMember = noOfMember;
	}
	public Details() {
		super();

	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", departmentName=" + departmentName + ", noOfMember=" + noOfMember + "]";
	}
	
}
