package com.funding.payment;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@Service
@Log
public class PatmentService {
	private final SaleRepository saleRepository;
	private final PaymentRepository paymentRepository;
	
	public void savecreditinfo(String paymentKey, String orederId, int amount, String orderName) {
		CallbackPayload cp = new CallbackPayload();
		//cp.setCustomerName(customerName);
		cp.setOrderName(orderName);
		cp.setAmount(amount);
		cp.setOrderId(orederId);
		cp.setPaymentKey(paymentKey);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+cp+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}

	
}
