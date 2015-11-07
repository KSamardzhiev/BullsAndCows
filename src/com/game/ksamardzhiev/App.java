package com.game.ksamardzhiev;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Number compNumber = new Number();
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
			
			int[] userDigits = new int[4];
			for(int i = 0; i<userInput.length(); i++){
				userDigits[i] = Integer.parseInt(userInput.substring(i, i+1));
			}
			
			Number guess = new Number(userDigits);
			if(compNumber.equals(guess)){
				success=true;
				System.out.println("Success");
			}
			else {
				Answer ans = NumberMatcher.match(compNumber, guess);
				System.out.println(ans);
			}
		}
		inputScanner.close();
		
	}

}
