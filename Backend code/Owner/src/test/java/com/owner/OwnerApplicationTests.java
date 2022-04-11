package com.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.owner.entity.Details;
import com.owner.repo.OwnerRepo;
import com.owner.service.OwnerService;


@RunWith(SpringRunner.class)
@SpringBootTest
  class OwnerApplicationTests {
	@Autowired
	private OwnerService ownerservice;
	@MockBean
	private OwnerRepo ownerRepo;
	@Test
	 void getUsersTest() {
		when(ownerRepo.findAll()).thenReturn(Stream.of(new Details(23,"komal",12)).collect(Collectors.toList()));
		assertEquals(1,ownerservice.getUsers().size());

	}
	@Test
	 void addDepartmentTest(){
		Details det=new Details(2,"payal",23);
		when(ownerRepo.save(det)).thenReturn(det);
		assertEquals(det,ownerservice.addDepartment(det));
	}
	@Test

	 void update() {
		Details updateDetails =  new Details(23,"manager",12
		);
		ownerservice.updateDepartment(updateDetails);
		verify(ownerRepo,times(1)).save(updateDetails);
	}
	@Test
	 void delete() {
		Details userDetails =  new Details(23,"manager",12
				);
		ownerservice.deleteDepartment(userDetails);
		verify(ownerRepo,times(1)).delete(userDetails);
	}


}