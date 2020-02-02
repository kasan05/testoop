package com.singtel.assignment.animal.count;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.Bird;
import com.singtel.assignment.animal.ButterFly;
import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Chicken;
import com.singtel.assignment.animal.ClownFish;
import com.singtel.assignment.animal.Dog;
import com.singtel.assignment.animal.Dolphin;
import com.singtel.assignment.animal.Duck;
import com.singtel.assignment.animal.Fish;
import com.singtel.assignment.animal.Flyable;
import com.singtel.assignment.animal.Frog;
import com.singtel.assignment.animal.Parrot;
import com.singtel.assignment.animal.Rooster;
import com.singtel.assignment.animal.Shark;
import com.singtel.assignment.animal.Singable;
import com.singtel.assignment.animal.Swimmable;
import com.singtel.assignment.animal.Walkable;

@Component
public class CountAnimals {

	private static Animal[] animals;

	
	public static Animal[] getAnimalArray() {
		animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
				new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new ButterFly(), new Cat() };
		return animals;
	}

	public int countAnimalsWhichCanFly() {
		return  Arrays.stream(getAnimalArray()).filter(animal->animal instanceof Flyable)
		.collect(Collectors.counting()).intValue();
	}
	
	public int countAnimalsWhichCanWalk() {
		return  Arrays.stream(getAnimalArray()).filter(animal->animal instanceof Walkable)
				.collect(Collectors.counting()).intValue();
	}
	
	public int countAnimalsWhichCanSing() {
		return  Arrays.stream(getAnimalArray()).filter(animal->animal instanceof Singable)
				.collect(Collectors.counting()).intValue();
	}
	
	public int countAnimalsWhichCanSwim() {
		return  Arrays.stream(getAnimalArray()).filter(animal->animal instanceof Swimmable)
				.collect(Collectors.counting()).intValue();
	}
	
	
	public static void main(String[] args) {
		CountAnimals countAnimals = new CountAnimals();
		System.out.println("No Of Animals Which Can Fly is:"+countAnimals.countAnimalsWhichCanFly());
		System.out.println("No Of Animals Which Can Walk is:"+countAnimals.countAnimalsWhichCanWalk());
		System.out.println("No Of Animals Which Can Sing is:"+countAnimals.countAnimalsWhichCanSing());
		System.out.println("No Of Animals Which Can Swim is:"+countAnimals.countAnimalsWhichCanSwim());
		
		
	}

}
