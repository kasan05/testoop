package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class FlyableBirds extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}
	
}
