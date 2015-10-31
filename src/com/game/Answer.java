package com.game;

public class Answer {

	private int bulls;
	private int cows;
	
	public Answer(int bulls, int cows){
		this.bulls = bulls;
		this.cows = cows;
	}
	
	public int getBulls(){
		return this.bulls;
	}
	
	public int getCows(){
		return this.cows;
	}
	
	@Override
	public String toString(){
		return "Bulls: " + this.bulls + ", Cows:  " + cows;
	}
	
}
