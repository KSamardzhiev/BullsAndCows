package com.game;

import java.util.Arrays;
import java.util.Random;

public class Number {

	private int[] digits;
	
	public Number(){
		this(generateRandomDigits());
	}

	public Number(int[] digits){
		this.digits = digits;
	}
	
	private static int[] generateRandomDigits() {
		
		int[] generatedDigits = new int[4];
		Random rand = new Random();
		int ind = 0;
		while(ind!=4){
			int genDigit = rand.nextInt(10);
			
			boolean alreadyExist = false;
			for (int existDigit : generatedDigits) {
				if(genDigit == existDigit){
					alreadyExist = true;
					break;
				}
			}
			
			if(!alreadyExist){
				generatedDigits[ind]=genDigit;
				ind++;
			}	
		}
		
		return generatedDigits;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Number)){
			return false;
		}
		
		Number otherNumber = (Number) obj;
		
		return Arrays.equals(digits, otherNumber.digits);	
	}

	public int[] getDigits(){
		return Arrays.copyOf(this.digits, this.digits.length);
	}
	
	
	
	
}
