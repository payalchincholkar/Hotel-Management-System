package com.receptionistmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receptionistmanagement.entity.GuestEntity;
import com.receptionistmanagement.repository.GuestRepository;
@Service
public class GuestServiceImpl implements GuestService {
	@Autowired
	private GuestRepository guestRepository;

	@Override
	public GuestEntity addGuest(GuestEntity guestEntity) {
		
		return this.guestRepository.save(guestEntity);
	}

	@Override
	public GuestEntity updateEntity(GuestEntity guestEntity) {
		return this.guestRepository.save(guestEntity);
	}

	@Override
	public void deleteById(Integer code) {
		guestRepository.deleteById(code);
		
	}

	@Override
	public GuestEntity updateById(Integer code) {
		
		return this.guestRepository.findById(code).get();
	}

	@Override
	public List<GuestEntity> getAllGuest() {
		return guestRepository.findAll();
	}
}
	