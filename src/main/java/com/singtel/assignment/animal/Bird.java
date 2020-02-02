package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Bird extends Animal implements  Singable {

	@Override
	public String sing() {
		return "I am singing";
	}
		//I removed fly method.some birds cannot fly.i made that as non generic
}
