package com.managermanagement.service;

import java.util.List;

import com.managermanagement.entity.RoomEntity;

public interface RoomService {
 public List<RoomEntity> getAllRooms();
 public RoomEntity addroom(RoomEntity roomEntity);
 public void deletebyId(Integer rNumber);
 public RoomEntity getbyid(Integer rNumber);
}
