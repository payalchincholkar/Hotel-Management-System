package com.owner.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.owner.entity.Details;
import com.owner.service.OwnerServiceImpl;
@SpringBootTest(classes = { OwnerControllerTest.class })
class OwnerControllerTest {

    @InjectMocks
    private OwnerController controller;
    @Mock
    private OwnerServiceImpl ownerServiceImplement;
    @Mock
    private RestTemplate restTemplate;
    @Test
    void addDepartment() {
       
       Details detail=new Details(2,"owner",0);
       when(ownerServiceImplement.addDepartment(detail)).thenReturn(detail);
       ResponseEntity<Details> res=controller.addDepartment(detail);
       
       assertEquals(HttpStatus.CREATED,res.getStatusCode());
       assertEquals(detail,res.getBody());
    }
    
    @Test
     void updateDepartment()
    {
   Details detail=new Details(2,"owner",45);
   int id=2;
   when(ownerServiceImplement.getUsersByID(id)).thenReturn(detail);
   when(ownerServiceImplement.updateDepartment(detail)).thenReturn(detail);
   
   ResponseEntity<Details> res=controller.updateDepartment(detail);
   
   assertEquals(HttpStatus.OK,res.getStatusCode());
   assertEquals(2,res.getBody().getId());
   assertEquals("owner",res.getBody().getDepartmentName());
   assertEquals(45,res.getBody().getNoOfMember());
   
    }

    
    @Test
    void deleteDepartment()
    {
    	Details detail=new Details(1,"owner",45);
    	int id=1;
    	when(ownerServiceImplement.getUsersByID(id)).thenReturn(detail);
        ResponseEntity<Details> res=controller.deleteDepartment(id);
        assertEquals(HttpStatus.OK,res.getStatusCode());
         
    }
    


    @Test
    void findAllUsers() {
        List <Details> detail=new ArrayList<>();
        when(ownerServiceImplement.getUsers()).thenReturn(detail);
        assertEquals(detail.size(), controller.findAllUsers().getBody().size());



    }

}