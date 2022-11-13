package com.funding.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AnswerController {

	private final AnswerService answerService;
	private final FundBoardService fundBoardService;
	
	
	//댓글 삭제
	@RequestMapping("/delete/{id}")
	public void deleteAnswer(@PathVariable("id")Integer id) {
		Answer answer = answerService.findById(id);
		answerService.deleteAnswer(answer);
	}
	
	
	//댓글 생성,id는 부모글 id
	@RequestMapping("/create/{id}")
	public void createAnswer(@RequestParam("content")String content, @PathVariable("id")Integer id) {
		FundBoard fundBoard = fundBoardService.findById(id);
		answerService.createAnswer(content, fundBoard);
		
	}
	
}
