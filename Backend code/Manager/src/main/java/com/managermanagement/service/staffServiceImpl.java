package com.managermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.managermanagement.entity.StaffEntity;
import com.managermanagement.repository.StaffRepository;
@Service
public class staffServiceImpl implements staffService {
    @Autowired
   private StaffRepository staffRepository;
	@Override
	public StaffEntity addStaff(StaffEntity staffEntity) {
		
		return this.staffRepository.save(staffEntity) ;
	}

	@Override
	public List<StaffEntity> getallStaffEntities() {
	
		return this.staffRepository.findAll();
	}

	@Override
	public StaffEntity getbyid(String code) {
		return this.staffRepository.findById(code).get();
		
	}

	@Override
	public String deletebyid(String  code) {
		 staffRepository.deleteById(code);
		 return code+" is deleted";
	
	}

	@Override
	public String updateStaff(StaffEntity staffEntity,String code) {
		
		
	
	 Optional<StaffEntity> staffData = staffRepository.findById(code);
	if(staffData.isPresent())
	{
	StaffEntity staffs = staffData.get();
	staffs.setCode(staffEntity.getCode());
	staffs.setEmployeeName(staffEntity.getEmployeeName());
	staffs.setEmployeeAddress(staffEntity.getEmployeeAddress());
	staffs.setNic(staffEntity.getNic());
	staffs.setSalary(staffEntity.getSalary());
	staffs.setNameAge(staffEntity.getNameAge());
	staffs.setOccupation(staffEntity.getOccupation());
	staffs.setEmail(staffEntity.getEmail());
	staffRepository.save(staffs);
	return "your data is updated";
	
	}
	else {
		return "your data is not updated";
	}	
	}
}
