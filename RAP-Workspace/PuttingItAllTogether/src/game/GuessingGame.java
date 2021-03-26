package game;

import java.util.Scanner;

public class GuessingGame {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//1-10 
		double randomNumber = Math.floor(Math.random()*10)+1; 
		
		//Let your user guess until they guess the number
		//if they guess too high tell them 
		//if they guess too low tell them 
		//Let them know they won 
		
		scan.close(); 
	}
	
	private static int getInput(String prompt) {
		System.out.println(prompt);
		//one word scan.next();
		int result = scan.nextInt(); 
		return result; 
	}
}
