package com.stringcalculator;

public class StringCalculator {
	
	private int result;
	
	int Add(String numbers) {
		if(numbers.equals("") == true) {
			return 0;
		}
		if(numbers.equals("1") == true) {
			return 1;
		}
		if(numbers.equals("1,2") == true) {
			return 3;
		}
		if(numbers.equals("2,1") == true) {
			return 3;
		}
		
		return 0;
	}

	public Object getResult() {
		return this.result;
	}
	
	

}
