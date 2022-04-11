package com.managermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managermanagement.entity.RoomEntity;
import com.managermanagement.repository.RoomRepo;
@Service
public class RoomServiceImpl implements RoomService {
     @Autowired
     private RoomRepo roomRepo;
	@Override
	public List<RoomEntity> getAllRooms() {
		
		return this.roomRepo.findAll();
	}
	@Override
	public RoomEntity addroom(RoomEntity roomEntity) {
	
		return this.roomRepo.save(roomEntity);
	}

	@Override
	public void deletebyId(Integer rNumber) {
	  this.roomRepo.deleteById(rNumber);
		
	}

	@Override
	public RoomEntity getbyid(Integer rNumber) {
	
		return roomRepo.findById(rNumber).get() ;
	}

}
