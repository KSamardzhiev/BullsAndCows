package com.game.ksamardzhiev;

import java.util.Scanner;

public class AppLetters {

	public static void main(String[] args) {
		Letters compNumber = new Letters();
		Scanner inputScanner = null;
		boolean success = false;
		
		while(!success){
			System.out.println("Enter your guess:");
			
			inputScanner = new Scanner(System.in);
			String userInput = inputScanner.nextLine();
			
			if(userInput == null || userInput.length() !=4){
				System.out.println("Wrong input!");
				continue;
			}
			
			int[] userLetters = new int[4];
			for(int i = 0; i<userInput.length(); i++){
				userLetters[i] = Integer.parseInt(userInput.substring(i, i+1));
			}
			
			Letters guess = new Letters(userLetters);
			if(compNumber.equals(guess)){
				success=true;
				System.out.println("Success");
			}
			else {
				Answer ans = LettersMatcher.match(compNumber, guess);
				System.out.println(ans);
			}
		}
		inputScanner.close();
		

	}

}
