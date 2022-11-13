package com.funding;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.funding.FundArtist.FundArtist;
import com.funding.FundArtist.FundArtistRepository;
import com.funding.FundUser.FundUserRepository;

import com.funding.fundBoard.FundBoard;
import com.funding.fundBoard.FundBoardRepository;

@SpringBootTest
class FundingApplicationTests {
<<<<<<< HEAD
	
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
=======

	@Autowired
	private FundUserRepository fundUserRepository;
	@Autowired
	private FundArtistRepository fundArtistRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	public void userCreateTest() {
		
		FundArtist fundArtist = new FundArtist();
		
		fundArtist.setUsername("1234");
		fundArtist.setPassword(passwordEncoder.encode("1234"));
		fundArtist.setEmail("testEmail@naver.com");
		fundArtist.setMobile("testMobile12345566");
		fundArtist.setRole("artist");
		
		this.fundArtistRepository.save(fundArtist);
		
		
//		FundUser fundUser = new FundUser();
//		
//		fundUser.setUsername("123");
//		fundUser.setPassword(passwordEncoder.encode("123"));
//		fundUser.setEmail("testEmail@naver.com");
//		fundUser.setMobile("testMobile12345566");
//		fundUser.setRole("user");
//		
//		this.fundUserRepository.save(fundUser);
>>>>>>> origin/LDH_branch
	}

}
