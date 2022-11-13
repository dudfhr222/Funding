package com.funding.FundUser;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.funding.index.RegisterValidation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FundUserService {
	
	private final FundUserRepository fundUserRepository;
	private final PasswordEncoder passwordEncoder;
	// 회원가입 , 유저 생성
	public void register(RegisterValidation vo) {
		
		FundUser fundUser = new FundUser();
		
		fundUser.setUsername(vo.getUsername());
		fundUser.setPassword(passwordEncoder.encode(vo.getPassword1()));
		fundUser.setEmail(vo.getEmail());
		fundUser.setMobile(vo.getMobile());
		fundUser.setRole("user");
		
		this.fundUserRepository.save(fundUser);
	}
}
