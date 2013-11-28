package com.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTester {

	@Test
	public void testAdd1() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("");
		assertEquals(result, 0);
	}
	
	@Test
	public void testAdd2() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("1");
		assertEquals(result, 1);
	}
	@Test
	public void testAdd3() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("1,2");
		assertEquals(result, 3);
	}
	@Test
	public void testAdd4() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("1,2,3");
		assertEquals(result, 6);
	}
	
	@Test
	public void testAdd5() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("1,2\n3");
		assertEquals(result, 6);
	}
	
	@Test
	public void testAdd6() {
		StringCalculator calc = new StringCalculator();
		int result = calc.Add("//;\n1,2\n3");
		assertEquals(result, 6);
	}

}
