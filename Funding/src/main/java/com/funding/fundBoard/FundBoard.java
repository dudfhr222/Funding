package com.funding.fundBoard;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class FundBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fundBoardId_seq")
	@SequenceGenerator(sequenceName = "fundBoardId_seq", allocationSize = 1, name = "fundBoardId_seq")
	private Integer id;	// 고유번호
	
	private String subject; // 제목
	
	private String content; // 내용
	
	private String place; // 장소
	
	private Date startDate; // 공연 시작 일자
	
	private String runtime; // 공연 시간
	
	private String state; // 펀딩 상태
	
	private String fundDuration; // 펀딩 기간
	
	private Integer minFund; // 펀딩 기간
	
	private Integer fundCurrent; // 펀딩 현재 금액
	
	private Integer fundAmount; // 펀딩 목표 금액

	private Integer currentMember; // 현재 모집 인원
	
	private Integer vote; // 별점 투표 수
	
	private Integer star; // 별점 평균
	
	@ManyToOne
	private FundUser fundUserId;
	
	@ManyToOne
	private Category categoryId;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
