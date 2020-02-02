package com.singtel.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Parrot;

@SpringBootTest
public class ParrotTest {

	@Autowired
	private Cat cat;

	@Bean
	public Parrot parrotLivingWithCats(Cat cat) {
		return new Parrot(cat);
	};

	@Test
	public void testSing() {
		String sound = "Meow";
		assertThat(sound.equals(parrotLivingWithCats(cat).sing()));
	}
}
