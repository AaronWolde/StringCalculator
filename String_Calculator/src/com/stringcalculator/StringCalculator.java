package com.stringcalculator;

public class StringCalculator {

	private int result;

	int Add(String numbers) {
		if(numbers.equals("") == true) {
			return 0;
		}
		int sum = 0;
		String words[];

		if(numbers.charAt(0) == '/' && numbers.charAt(1) == '/' && numbers.charAt(3) == '\n') {
		
			char delimiter = numbers.charAt(2);
			words = numbers.split("[//"+delimiter+",\n]");
		}
		else {
			words= numbers.split("[,\n]");
		}
		
		boolean negative_flag = false;
		String negativs = new String();
		
		for(int i = 0; i < words.length; i++) {
			if(!words[i].equals("")) {		
				int num = Integer.parseInt(words[i]); 
				if(num < 0) {
					negativs += words[i] +" ,";
					negative_flag = true;
				}
				sum += num; 
			}
		}
		if(negative_flag == true) {
			System.out.println("negatives not allowed:"+negativs);
		}
		
		return sum;
	}

	public Object getResult() {
		return this.result;
	}
}
