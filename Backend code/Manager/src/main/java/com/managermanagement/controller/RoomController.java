package com.managermanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.managermanagement.entity.RoomEntity;

import com.managermanagement.service.RoomService;
@CrossOrigin
@RestController
@RequestMapping("/room")
public class RoomController {
	@Autowired
	private RoomService roomService;

	@GetMapping("/get")
	public ResponseEntity<?> getroom() {
		return ResponseEntity.ok(this.roomService.getAllRooms());
	}

	@GetMapping("/getroom/{id}")
	public ResponseEntity<?> getroombyid(@PathVariable Integer id) {
		return ResponseEntity.ok(this.roomService.getbyid(id));
	}
	
	@PostMapping("/add")
	public RoomEntity addRoom(@RequestBody RoomEntity roomEntity) {
		return this.roomService.addroom(roomEntity);
	}

	@DeleteMapping("/deleteroom/{rnumber}")
	public int deleteroom(@PathVariable ("rnumber") Integer rnumber) {
		this.roomService.deletebyId(rnumber);
		return rnumber;
	}

}
