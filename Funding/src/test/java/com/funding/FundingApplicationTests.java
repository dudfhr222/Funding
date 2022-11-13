package com.funding;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.funding.FundArtist.FundArtist;
import com.funding.FundArtist.FundArtistRepository;
import com.funding.FundUser.FundUserRepository;

@SpringBootTest
class FundingApplicationTests {

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
	}

}
