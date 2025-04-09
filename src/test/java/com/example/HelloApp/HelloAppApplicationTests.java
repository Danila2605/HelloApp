package com.example.HelloApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class HelloAppApplicationTests {

	@Test
	public void testAddition() {
		assertEquals(2, 1 + 1);
	}
}
