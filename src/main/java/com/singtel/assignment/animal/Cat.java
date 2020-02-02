package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal implements Singable {

	@Override
	public String sing() {
		return "Meow";
	}

}
