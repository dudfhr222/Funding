package com.funding;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funding.fundBoard.FundBoard;
import com.funding.fundBoard.FundBoardRepository;

@SpringBootTest
class FundingApplicationTests {
	
	@Autowired
	private FundBoardRepository fundBoardRepository;
	
	@Test
	void contextLoads() {
		
		FundBoard f = new FundBoard();
		f.setSubject("테스트");
		f.setContent("테스트");
		f.setPlace("테스트");
		f.setStartDate(LocalDateTime.now());
		f.setRuntime("테스트");
		f.setState("테스트");
		f.setFundDuration("테스트");
		f.setMinFund(1);
		f.setFundCurrent(1);
		f.setFundAmount(1);
		f.setCurrentMember(1);
		f.setVote(1);
		f.setStar(1);
		
		this.fundBoardRepository.save(f);
	}

}
