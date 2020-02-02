package com.singtel.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.assignment.animal.Shark;

@SpringBootTest
public class SharkTest {

	@Autowired
	private Shark shark;

	@Test
	public void testShark() {
		String size = "large";
		String color = "grey";
		assertThat(size.equals(shark.getSize()));
		assertThat(color.equals(shark.getColor()));
	}
}
