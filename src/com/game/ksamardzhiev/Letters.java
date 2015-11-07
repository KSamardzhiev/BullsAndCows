package com.game.ksamardzhiev;

import java.util.Arrays;
import java.util.Random;

public class Letters {
	
	private int[] letters;

	public Letters(){
		this(generateRandomLetters());
	}

	public Letters(int[] letters){
		this.letters = letters;
	}

	private static int[] generateRandomLetters() {

		int[] generatedLetters = new int[4];
		Random rand = new Random();
		int ind = 0;
		while (ind != 4) {
			int genLetter = rand.nextInt(25)+66;

			boolean alreadyExist = false;
			for (int existDigit : generatedLetters) {
				if (genLetter == existDigit) {
					alreadyExist = true;
					break;
				}
			}

			if (!alreadyExist) {
				generatedLetters[ind] = genLetter;
				ind++;
			}
		}

		return generatedLetters;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Number)) {
			return false;
		}

		Letters otherNumber = (Letters) obj;

		return Arrays.equals(letters, otherNumber.letters);
	}

	public int[] getLetters() {
		return Arrays.copyOf(this.letters, this.letters.length);
	}
}
