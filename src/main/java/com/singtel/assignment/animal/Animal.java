package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Animal implements Walkable {

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
}
