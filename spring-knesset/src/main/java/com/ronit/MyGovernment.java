package com.ronit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.ronit.beans.HeadOfOpposition;
import com.ronit.beans.Knesset;



@SpringBootApplication
@PropertySource(value = "classpath:knesset.properties")
public class MyGovernment {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(MyGovernment.class);
		HeadOfOpposition opposition = Context.getBean(HeadOfOpposition.class);
		System.out.println(opposition);
		Knesset Knesset = Context.getBean(Knesset.class);
		System.out.println(Knesset);
		Knesset.add(Context.getBean(HeadOfOpposition.class));
		Knesset.getPoliticians().get(0).goCorrupt();
		Knesset.getPoliticians().get(1).goStraight();
//		IsraelHayom newspaper = Context.getBean(IsraelHayom.class);
//		System.out.println(newspaper);
	}

}
