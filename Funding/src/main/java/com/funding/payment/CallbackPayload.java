package com.funding.payment;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CallbackPayload {
    private String secret; //개인키
    private String status; //결제상태(완료,대기,취소)
    private String orderId; //주문번호
    
    private String orderName; // 상품명
    private int amount; //금액
    private String customerName; //고객이름
}
