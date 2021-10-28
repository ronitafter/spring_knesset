package com.ronit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Haaretz implements Newspaper {

	public void headline() {
		System.out.println("Haaretz: this is a headline");

	}

	@Override
	public String toString() {
		return "Haaretz Newspaper";
	}

}
