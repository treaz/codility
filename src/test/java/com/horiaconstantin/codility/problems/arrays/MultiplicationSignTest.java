package com.horiaconstantin.codility.problems.arrays;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.codility.problems.arrays.MultiplicationSign.multiplicationSign;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationSignTest {

	@Test
	void testMultiplicationSign() {
		assertEquals(0, multiplicationSign(new int[]{1, -2, -3, 5, 0}));
		assertEquals(1, multiplicationSign(new int[]{1, -2, -3, 5}));
		assertEquals(-1, multiplicationSign(new int[]{1, 2, 3, -5}));
	}
}