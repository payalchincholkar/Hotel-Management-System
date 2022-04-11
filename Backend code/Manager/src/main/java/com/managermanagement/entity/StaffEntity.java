package com.managermanagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staff")

public class StaffEntity {
@Id
	private String code;
	private String employeeName;
	private String employeeAddress;
	private String nic;
	private double salary;
	private int nameAge;
	private String occupation;
	private String email;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNameAge() {
		return nameAge;
	}
	public void setNameAge(int nameAge) {
		this.nameAge = nameAge;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StaffEntity [code=" + code + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress
				+ ", nic=" + nic + ", salary=" + salary + ", nameAge=" + nameAge + ", occupation=" + occupation
				+ ", email=" + email + "]";
	}
	public StaffEntity(String code, String employeeName, String employeeAddress, String nic, double salary, int nameAge,
			String occupation, String email) {
		super();
		this.code = code;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.nic = nic;
		this.salary = salary;
		this.nameAge = nameAge;
		this.occupation = occupation;
		this.email = email;
	}
	public StaffEntity() {
		super();
	
	}
	

}