package com.horiaconstantin.codility.problems.arrays;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.codility.problems.arrays.MaxSumOfPairWithSameSumOfDigits.maxSumOfPairsWithDigitsSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfPairWithSameSumOfDigitsTest {

	@Test
	void testMaxSumOfPairsWithDigitsSum() {
		assertEquals(93, maxSumOfPairsWithDigitsSum(new int[]{51, 71, 17, 42}));
		assertEquals(102, maxSumOfPairsWithDigitsSum(new int[]{42, 33, 60}));
		assertEquals(-1, maxSumOfPairsWithDigitsSum(new int[]{51, 32, 43}));
	}
}