package com.ronit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TransportationMinister extends Politician {

	@Autowired
	public TransportationMinister(@Value("${TransportationMinister.name}") String name, @Value("${TransportationMinister.favoriteActivity}") String favoriteActivity,
			@Qualifier("Haaretz") Newspaper dailyNewspaper) {
		super(name, favoriteActivity, dailyNewspaper);
	}
}
