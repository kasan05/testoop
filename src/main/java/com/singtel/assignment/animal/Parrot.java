package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Parrot extends FlyableBirds {

	private Singable livingWith;
	
	public Parrot() {}
	public Parrot(Singable livingWith) {
		this.livingWith = livingWith;
	}
	
	public String sing(Dog dog) {
		return dog.sing();
	}
	public String sing(Cat cat) {
		return cat.sing();
	}
	public String sing(Rooster rooster) {
		return rooster.sing();
	}
	public String sing() {
		return livingWith.sing();
	}
	
}

