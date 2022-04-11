package com.managermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.managermanagement.entity.StaffEntity;
import com.managermanagement.service.staffService;
@CrossOrigin
@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	private staffService staffservice;

	@PostMapping("/insert")
	public StaffEntity addStaff(@RequestBody StaffEntity staffEntity) {
		return this.staffservice.addStaff(staffEntity);
	}

	@GetMapping("/view")
	public ResponseEntity<?> getStaff() {
		return ResponseEntity.ok(this.staffservice.getallStaffEntities());
	}

	@GetMapping("/view/{id}")
	public StaffEntity getStaffId(@PathVariable("id") String code) {
		return this.staffservice.getbyid(code);
	}

	@PutMapping("/update/{id}")
	public void updateEntity(@PathVariable("id") String code,@RequestBody StaffEntity staffEntity) {
		this.staffservice.updateStaff(staffEntity,code);
		
	}
	@DeleteMapping("/delete/{code}")
	public String deletebyid(@PathVariable ("code") String code)
	{
		this.staffservice.deletebyid(code);
		return code;
}
}