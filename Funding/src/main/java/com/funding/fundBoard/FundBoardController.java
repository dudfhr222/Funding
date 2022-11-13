package com.funding.fundBoard;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class FundBoardController {
	
	private final FundBoardRepository fundBoardRepository;
	
	@RequestMapping("/fundBoard")
	public String fundBoard(Model model) {
		
		List<FundBoard> fundBoardList = this.fundBoardRepository.findAll();
		
		model.addAttribute("fundBoard", fundBoardList);
		
		return "FundBoard";
	}
	
}
