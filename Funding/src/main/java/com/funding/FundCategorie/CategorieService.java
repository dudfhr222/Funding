package com.funding.FundCategorie;

import java.util.List;

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
	
	
	//카테고리 목록 불러오기
	public List<Categorie> findAll(){
		List<Categorie> cList = categorieRepository.findAll();
		
		return cList;
	}
	
}
