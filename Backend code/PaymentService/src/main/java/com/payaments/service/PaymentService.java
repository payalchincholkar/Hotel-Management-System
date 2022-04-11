package com.payaments.service;


import java.util.Map;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
@Service
public class PaymentService {
	public String createTransaction(int data) throws RazorpayException {
		RazorpayClient client = new RazorpayClient("rzp_test_3dVBVuTuawUAhi", "gE1qB63uh0QmTCg6Fd8OQgWi");

		JSONObject obj = new JSONObject();
		obj.put("amount", data*100);
		obj.put("currency", "INR");
		obj.put("receipt", "txn_122311");

		Order order = client.Orders.create(obj);
		System.out.println(order);

		return order.toString();
		}
	
	

}
