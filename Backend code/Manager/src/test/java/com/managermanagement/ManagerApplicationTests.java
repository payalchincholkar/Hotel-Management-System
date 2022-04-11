package com.managermanagement;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.managermanagement.entity.StaffEntity;
//import com.managermanagement.repository.StaffRepository;
//import com.managermanagement.service.staffService;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
// public  class ManagerApplicationTests {
//	@Autowired
//	private staffService staffservice;
//	@MockBean
//	private StaffRepository staffRepository;
//	@Test
//	 public void getUsersTest() {
//		when(staffRepository.findAll()).thenReturn(Stream.of(new StaffEntity(1,"payal","xyz","payu",56788,"fgh",4,"working","p@gmail.com")).collect(Collectors.toList()));
//		assertEquals(1,staffservice.getallStaffEntities().size());
//
//	}
//
//}