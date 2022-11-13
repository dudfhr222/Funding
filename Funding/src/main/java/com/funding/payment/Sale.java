package com.funding.payment;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="sale")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "payCode")
	private String payCode;
	
	@Column(name = "payDate")
	private LocalDateTime payDate;
	
	@Column(name = "payMoney")
	private Integer payMoney;
	
	@Column(name = "payState")
	private String payState;
	
	@Column(name = "fundUser_id")
	private String fundUser_id;
	
	@Column(name = "fundBoard_id")
	private String fundBoard_id;
}
