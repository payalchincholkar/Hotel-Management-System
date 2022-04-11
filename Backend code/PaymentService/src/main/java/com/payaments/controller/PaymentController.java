package com.payaments.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payaments.service.PaymentService;
import com.razorpay.RazorpayException;
@RestController
@CrossOrigin
public class PaymentController {
	@Autowired
	public PaymentService paymentService;
	@PostMapping("/create")
	public String createTran(@RequestBody int data) throws RazorpayException
	{
		System.out.println("data");
	return paymentService.createTransaction(data);
	}


}
