package com.funding.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

	// 로그인 폼 요청 
	@GetMapping("/login")
	public String loginForm() {
		
		return "user/loginForm";
	}
}
