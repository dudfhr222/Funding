package com.funding.fundBoardTarget;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FundTargetService {

	private final FundTargetRepository fundTargetRepository;
	
	
	public void create(String subject,String content,String place) {
		FundBaordTarget target = new FundBaordTarget();
		target.setContent(content);
		target.setPlace(place);
		target.setSubject(subject);
		
		
		fundTargetRepository.save(target);
	}
	
}
