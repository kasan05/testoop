package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Duck extends FlyableBirds implements Swimmable {


	@Override
	public String sing() {
		return "Quak Quak";
	}
	
	public String swim() {
		return "I can swim";
	}
	
}
