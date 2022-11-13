package com.funding.FundArtist;

import org.springframework.stereotype.Service;

import com.funding.FundUser.FundUser;
import com.funding.index.RegisterValidation;

@Service
public class FundArtistService {
	
	private FundArtistRepository fundArtistRepository;
	
	// 회원가입 , 유저 생성
	public void register(RegisterValidation vo) {
		
		FundArtist fundArtist = new FundArtist();
		
		fundArtist.setUsername(vo.getUsername());
		fundArtist.setPassword(vo.getPassword1());
		fundArtist.setEmail(vo.getEmail());
		fundArtist.setMobile(vo.getMobile());
		fundArtist.setRole("artist");
		
		this.fundArtistRepository.save(fundArtist);
	}
}
