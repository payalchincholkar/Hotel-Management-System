package com.owner.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongodb.connection.Stream;
import com.owner.entity.Details;
import com.owner.repo.OwnerRepo;
@SpringBootTest
class OwnerServiceImplTest {

	@InjectMocks
    private OwnerServiceImpl ownerservice;
    @Mock
    private OwnerRepo ownerRepo;
   
    public List<Details> detail;
    
    


    @Test
    void updateDepartment() {
        Details updateDetails =  new Details(23,"manager",12
        );
        ownerservice.updateDepartment(updateDetails);
        verify(ownerRepo,times(1)).save(updateDetails);
    }

    @Test
    void getUsers()
    {
   
    	detail= new ArrayList<>();
    	detail.add(new Details(1,"owner",56));
    	detail.add(new Details(2,"manager",89));

        when(ownerRepo.findAll()).thenReturn(detail);
        assertEquals(2,ownerservice.getUsers().size());
    }

    @Test
    void addDepartment() {
        Details det=new Details(2,"owner",23);
        when(ownerRepo.save(det)).thenReturn(det);
        assertEquals(det,ownerservice.addDepartment(det));
    }

    @Test
    void deleteDepartment()
    {
        Details det=new Details(2,"owner",23);
        ownerservice.deleteDepartment(det);
        verify(ownerRepo,times(1)).delete(det);
    }

    @Test
    void getUsersByID()
    {
    	List<Details> myowner=new ArrayList<Details>();
    	myowner.add(new Details(1,"owner",45));
    	myowner.add(new Details(2,"manager",45));
    	int id=1;
    	when(ownerRepo.findAll()).thenReturn(myowner);
    	assertEquals(id,ownerservice.getUsersByID(id).getId());
    }


}
