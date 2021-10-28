package com.ronit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Yediot implements Newspaper {

	public void headline() {
		System.out.println("Yediot: this is a headline");

	}

	@Override
	public String toString() {
		return "Yediot Newspaper";
	}

}
