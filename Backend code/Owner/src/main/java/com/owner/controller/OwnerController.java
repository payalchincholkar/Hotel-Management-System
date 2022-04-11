package com.owner.controller;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.owner.entity.Details;
import com.owner.service.OwnerService;
@CrossOrigin
@RestController
@RequestMapping("/manageDepartment")
public class OwnerController {

	@Autowired
	private OwnerService ownerservice;

	@PostMapping("/addDepartment")
	public ResponseEntity<Details> addDepartment(@RequestBody Details detail) {
		try 
		{
			
		Details save = this.ownerservice.addDepartment(detail);
		return new ResponseEntity<>(save,HttpStatus.CREATED);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping("/updateDepartment")
	public ResponseEntity<Details> updateDepartment(@RequestBody Details detail) {
		try 
		{ 
			
		int id= detail.getId();
		Details updateEntity = this.ownerservice.getUsersByID(id);
		updateEntity.setDepartmentName(detail.getDepartmentName());
		updateEntity.setNoOfMember(detail.getNoOfMember());
		Details updated_detail=ownerservice.updateDepartment(updateEntity); 
		return new ResponseEntity<>(updated_detail,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public ResponseEntity<Details> deleteDepartment(@PathVariable int id) {
		Details detail=null;
		try
		{ 
			detail=ownerservice.getUsersByID(id);
		ownerservice.deleteDepartment(detail);
		}
			catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			    }
		    return new ResponseEntity<>(detail,HttpStatus.OK);
	}

	@GetMapping("/getDepartment")
	public ResponseEntity<List<Details>> findAllUsers() {
		try {
		return new ResponseEntity<List<Details>>(ownerservice.getUsers(),HttpStatus.OK);
		}
		catch(Exception e)
		{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		}
		
	}
	@GetMapping("/getDepartment/{id}")
	public ResponseEntity<Details> getUsersById(@PathVariable(value="id") int id){
		try {
			Details details=ownerservice.getUsersByID(id);
			return new ResponseEntity<>(details,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}



