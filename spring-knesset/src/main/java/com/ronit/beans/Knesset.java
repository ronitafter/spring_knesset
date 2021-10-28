package com.ronit.beans;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@SpringBootApplication
// @PropertySource(value = "classpath:knesset.properties")
//@PropertySource(value = "classpath:knesset.properties")
//@PropertySource("classpath:config.properties")
public class Knesset {

	private String state;
	private String city;
	private Politician primeMinister;
	private List<Politician> politicians;

	public Knesset(@Value("${state}") String state, @Value("${city}") String city, Politician primeMinister) {
		this.state = state;
		this.city = city;
		this.primeMinister = primeMinister;
		politicians = new ArrayList<Politician>();
	}

	public String getCity() {
		return city;
	}

	public Politician getPrimeMinister() {
		return primeMinister;
	}

	public List<Politician> getPoliticians() {
		return politicians;
	}

	@Override
	public String toString() {
		return "Knesset [state=" + state + ", city=" + city + ", primeMinister=" + primeMinister + ", politicians="
				+ politicians + "]";
	}

	public void add(Politician politician) {
		politicians.add(politician);
	}

}
