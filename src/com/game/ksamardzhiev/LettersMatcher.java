package com.game.ksamardzhiev;

public class LettersMatcher {

	public static Answer match(Letters original, Letters guess){
		int[] letters = original.getLetters();
		int[] guessedDigits = guess.getLetters();
		
		int bulls=0;
		for(int i=0; i<letters.length; i++){
			if(letters[i]==guessedDigits[i]){
				bulls++;
			}
		}
		
		int cows=0;
		for(int i = 0; i < letters.length; i++){
			for(int j = 0; j<guessedDigits.length; j++){
				if(i !=j && letters[i]==guessedDigits[j]){
					cows++;
				}
			}
		}
		
		return new Answer(bulls, cows);
	}
}
