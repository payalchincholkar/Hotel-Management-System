package com.owner.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owner.entity.Details;
import com.owner.repo.OwnerRepo;
@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
    private OwnerRepo ownerRepo;


    @Override
    public Details addDepartment(Details detail) {
        detail.setId(getMaxId());
        ownerRepo.save(detail);
        return detail;
    }

    @Override
    public Details updateDepartment(Details detail) {
        return this.ownerRepo.save(detail);
    }

    
    @Override
    public List<Details> getUsers() {
        List<Details> users = ownerRepo.findAll();
        return users;  
        }

    @Override
    public void deleteDepartment(Details detail) {
        ownerRepo.delete(detail);
        
    }

	@Override
	public Details getUsersByID(int id) {
	
	  List<Details> details=ownerRepo.findAll();
	  Details detail=null;
	  for(Details con:details)
	  {
		  if(con.getId()==id)
			  detail=con;
	  }
	  return detail;
	}
   public int getMaxId()
   {
	   return ownerRepo.findAll().size()+1 ;
	   }
		
	}



