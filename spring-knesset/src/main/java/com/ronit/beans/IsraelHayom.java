package com.ronit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Primary
public class IsraelHayom implements Newspaper {
//	private String name;
//
//	public IsraelHayom() {
//		this.name = "IsraelHayom";
//	}

	@Override
	public String toString() {
		return "IsraelHayom Newspaper";
	}

	public void headline() {
		System.out.println("IsraelHayom: this is a headline");

	}

}
