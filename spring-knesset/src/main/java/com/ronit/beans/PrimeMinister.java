package com.ronit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimeMinister extends Politician{

	@Autowired
	public PrimeMinister(@Value("${primeMinister.name}")String name, @Value("${primeMinister.favoriteActivity}") String favoriteActivity, @Qualifier("Yediot") Newspaper dailyNewspaper) {
		super(name, favoriteActivity, dailyNewspaper);
		// TODO Auto-generated constructor stub
	}
}


