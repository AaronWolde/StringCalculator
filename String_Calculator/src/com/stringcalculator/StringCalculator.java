package com.stringcalculator;

public class StringCalculator {

	private int result;

	int Add(String numbers) {
		if(numbers.equals("") == true) {
			return 0;
		}
		int sum = 0;

		String words[]= numbers.split("[,\n]");

		for(int i = 0; i < words.length; i++) {
			sum += Integer.parseInt(words[i]); 
		}
		return sum;
	}

	public Object getResult() {
		return this.result;
	}
}
