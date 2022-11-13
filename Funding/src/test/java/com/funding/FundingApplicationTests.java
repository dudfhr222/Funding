package com.funding;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.funding.FundUser.FundUser;
import com.funding.FundUser.FundUserRepository;

@SpringBootTest
class FundingApplicationTests {

	@Autowired
	private FundUserRepository fundUserRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	public void userCreateTest() {
		
		
		FundUser fundUser = new FundUser();
		
		fundUser.setUsername("123");
		fundUser.setPassword(passwordEncoder.encode("123"));
		fundUser.setEmail("testEmail@naver.com");
		fundUser.setMobile("testMobile12345566");
		fundUser.setRole("user");
		
		this.fundUserRepository.save(fundUser);
	}

}
