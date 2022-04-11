package com.receptionistmanagement.service;

import java.util.List;

import com.receptionistmanagement.entity.GuestEntity;

public interface GuestService {
	public GuestEntity addGuest(GuestEntity guestEntity);
	 public GuestEntity updateEntity(GuestEntity guestEntity);
     public void deleteById(Integer code);
    public GuestEntity updateById(Integer code);
    public List<GuestEntity> getAllGuest();
}

