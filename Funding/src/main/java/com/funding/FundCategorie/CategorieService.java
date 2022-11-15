package com.funding.FundCategorie;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategorieService {

	private final CategorieRepository categorieRepository;
	
	//카테고리 만들기
	public void create(String name) {
		Categorie cate = new Categorie();
		cate.setCategoryName(name);
		
		categorieRepository.save(cate);
	}
	
}
