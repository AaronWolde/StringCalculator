package com.stringcalculator;

public class StringCalculator {

	private int result;

	int Add(String numbers) {
		if(numbers.equals("") == true) {
			return 0;
		}

		int sum = 0;

		for(int i = 0; i < numbers.length(); i++) {
			if(numbers.charAt(i) != ',') {
				sum += (numbers.charAt(i) - '0'); 
			}
		}

		return sum;
	}

	public Object getResult() {
		return this.result;
	}



}
