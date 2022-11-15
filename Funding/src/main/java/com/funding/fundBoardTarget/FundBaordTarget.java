package com.funding.fundBoardTarget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.funding.FundCategorie.Categorie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FundBaordTarget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String subject;
	
	private String content;
	
	private String place;
	
	@ManyToOne
	private Categorie categorie;
	
	
}
