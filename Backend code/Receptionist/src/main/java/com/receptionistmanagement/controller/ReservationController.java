package com.receptionistmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.receptionistmanagement.entity.PaymentEntity;
import com.receptionistmanagement.entity.ReservationEntity;
import com.receptionistmanagement.service.ReservationService;
@CrossOrigin
@RestController
@RequestMapping("/reservation")
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/view")
	public ResponseEntity<?> getReservation() {
		return ResponseEntity.ok(this.reservationService.getAllReservation());
	}

	@PostMapping("/add")
	public ResponseEntity<?> addReservation(@RequestBody ReservationEntity reservationEntity) {
		return ResponseEntity.ok(this.reservationService.addReservation(reservationEntity));
	}
	
	@GetMapping("/getpayment")
	public List<PaymentEntity> getPayment(){
	   return Arrays.asList(restTemplate.getForObject("http://paymentservice/payment/get", PaymentEntity[].class));
	}



}
