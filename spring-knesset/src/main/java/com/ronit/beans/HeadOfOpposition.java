package com.ronit.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HeadOfOpposition extends Politician {

	@Autowired
	public HeadOfOpposition(@Value("${headOfOpposition.name}") String name,
			@Value("${headOfOpposition.favoriteActivity}") String favoriteActivity,
			@Qualifier("Haaretz") Newspaper dailyNewspaper) {
		super(name, favoriteActivity, dailyNewspaper);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void goStraight() {
//		System.out.println(super.getName() + "goStraight...");
//
//	}
//	
//	@Override
//	public void goCorrupt() {
//		System.out.println(super.getName() + "goCorrupt...");
//
//	}

}
