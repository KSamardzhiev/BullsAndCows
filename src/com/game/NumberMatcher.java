package com.game;

public class NumberMatcher {
	
	public static Answer match(Number original, Number guess){
		int[] digits = original.getDigits();
		int[] guessedDigits = guess.getDigits();
		
		int bulls=0;
		for(int i=0; i<digits.length; i++){
			if(digits[i]==guessedDigits[i]){
				bulls++;
			}
		}
		
		int cows=0;
		for(int i = 0; i < digits.length; i++){
			for(int j = 0; j<guessedDigits.length; j++){
				if(i !=j && digits[i]==guessedDigits[j]){
					cows++;
				}
			}
		}
		
		return new Answer(bulls, cows);
	}
	
}