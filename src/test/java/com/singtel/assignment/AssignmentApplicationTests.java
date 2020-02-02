package com.singtel.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.assignment.animal.Bird;
import com.singtel.assignment.animal.Duck;

@SpringBootTest
class AssignmentApplicationTests {

	@Autowired
	private Bird bird ;
	
	@Autowired
	private Duck duck;
	
	@Test
	void testSing() {
		
		String birdSingingSoundExpected = "I am singing";
		String realSingingSound = bird.sing();
		assertThat(birdSingingSoundExpected.equals(realSingingSound));
		
		
		String duckSingingSoundExpected = "Quak Quak";
		String realDuckSingingSound = duck.sing();
		assertThat(duckSingingSoundExpected.equals(realDuckSingingSound)); 
	}

	
}
