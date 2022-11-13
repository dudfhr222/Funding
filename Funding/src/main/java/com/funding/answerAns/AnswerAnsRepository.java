package com.funding.answerAns;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funding.answer.Answer;

public interface AnswerAnsRepository extends JpaRepository<AnswerAns, Integer>{
	
	//answer로 해당 답글 찾기
	List<AnswerAns> findByanswerId(Answer answer);
}
