package com.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTester {

	@Test
	public void testAdd() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("1,2");
		assertEquals(result, 3);
	}

}
