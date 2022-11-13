package com.funding.FundUser;

import com.funding.index.RegisterValidation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FundUserService {
	
	private FundUserRepository fundUserRepository;
	
	// 회원가입 , 유저 생성
	public void register(RegisterValidation vo) {
		
		FundUser fundUser = new FundUser();
		
		fundUser.setUsername(vo.getUsername());
		fundUser.setPassword(vo.getPassword1());
		fundUser.setEmail(vo.getEmail());
		fundUser.setMobile(vo.getMobile());
		fundUser.setRole("user");
		
		this.fundUserRepository.save(fundUser);
	}
}
