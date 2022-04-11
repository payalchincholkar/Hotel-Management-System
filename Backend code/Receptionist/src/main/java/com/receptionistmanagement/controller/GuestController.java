package com.receptionistmanagement.controller;


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


import com.receptionistmanagement.entity.GuestEntity;
import com.receptionistmanagement.service.GuestService;
@CrossOrigin
@RestController
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	private GuestService guestService;

	@PostMapping("/insert")
	public GuestEntity insertGuest(@RequestBody GuestEntity guestEntity) {
		return this.guestService.addGuest(guestEntity);

	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllGuest() {
		return ResponseEntity.ok(this.guestService.getAllGuest());
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateGuest(@RequestBody GuestEntity guestEntity) {
		return ResponseEntity.ok(this.guestService.updateEntity(guestEntity));
	}

	@PutMapping("/update/{code}")
	public ResponseEntity<?> updateByCode(@PathVariable("code") Integer code) {
		return ResponseEntity.ok(this.guestService.updateById(code));
	}

	@DeleteMapping("/delete/{membercode}")
	public int deleteGuest(@PathVariable Integer membercode) {
		this.guestService.deleteById(membercode);
		return membercode;
	}
}
