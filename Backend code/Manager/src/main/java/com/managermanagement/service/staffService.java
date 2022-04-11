package com.managermanagement.service;

import java.util.List;

import com.managermanagement.entity.StaffEntity;

public interface staffService {
 public StaffEntity addStaff(StaffEntity staffEntity);
 public List<StaffEntity> getallStaffEntities();
 public StaffEntity getbyid(String code);
 public String deletebyid(String code);
 public String updateStaff(StaffEntity staffEntity,String code);
}
