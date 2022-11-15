package com.funding.payment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class PatmentService {
	private final SaleRepository saleRepository;
	private final PaymentRepository paymentRepository;
	
	public void savecreditinfo(String paymentKey, String orederId, int amount, String orderName) {
		List<Payment> pList = new ArrayList<>(); //고객이 계정삭제하면 사라지는 리스트
		
		CallbackPayload cp = new CallbackPayload(); //결제성공 시 정보
		cp.setCustomerName("이토페2");
		cp.setOrderName(orderName);
		cp.setAmount(amount);
		cp.setOrderId(orederId);
		cp.setPaymentKey(paymentKey);
		
		
		List<Sale> sList = new ArrayList<>(); //고객이 계정삭제해도 결제내역은 남아있는 리스트
		Sale sale = new Sale();
		sale.setFundUser_id("이토페2");
		sale.setFundBoard_id(orderName);
		sale.setPayMoney(amount);
		sale.setOrederId(orederId);
		sale.setPayCode(paymentKey);
		sale.setPayDate(LocalDateTime.now());
		sList.add(sale);
		saleRepository.save(sale);
	}	
}
