package com.funding.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// 로그인 폼 요청 
	@GetMapping("/login")
	public String loginForm() {
		
		return "loginForm";
	}
}
