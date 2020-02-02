package com.singtel.assignment.animal;

import org.springframework.stereotype.Component;

@Component
public class Fish extends Animal {

	private String size;
	private String color;
	public Fish() {}
	public Fish(String size,String color) {
		this.size = size;
		this.color = color;
	}
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
