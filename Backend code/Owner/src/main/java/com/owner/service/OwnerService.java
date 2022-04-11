package com.owner.service;

import java.util.List;

import com.owner.entity.Details;

public interface OwnerService {
	public Details addDepartment(Details detail);

	public Details updateDepartment(Details detail);

	public void deleteDepartment(Details detail);

	public List<Details> getUsers();
	public Details getUsersByID(int id);
	


   

}
