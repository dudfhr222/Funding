package com.funding.FundCategorie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequestMapping("categorie")
@RequiredArgsConstructor
@Controller
public class CategorieController {

	private final CategorieService categorieService;
	
	//카테고리 생성 폼
	@RequestMapping("/form")
	public String categorieform() {
		return "/categorie/categorieForm";
	}
	
	
	//카테고리 생성
	@RequestMapping("/create")
	public String createCategorie(@RequestParam String categorieName) {
		categorieService.create(categorieName);
		return "redirect:/";
	}
	
	
	
}
