//package game;
//
//import java.util.Scanner;
//
//public class GuessingGame {
//	private static Scanner scan = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//		//1-10 
//		double randomNumber = Math.floor(Math.random()*10)+1; 
//		
//		//Let your user guess until they guess the number
//		//if they guess too high tell them 
//		//if they guess too low tell them 
//		//Let them know they won 
//		
//		scan.close(); 
//	}
//	
//	private static int getInput(String prompt) {
//		System.out.println(prompt);
//		//one word scan.next();
//		int result = scan.nextInt(); 
//		return result; 
//	}
//}

package game;
import java.util.Scanner;
public class GuessingGame {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[]args) {
		// 1-10
		double randomNumber = Math.floor(Math.random()*10)+1;
		// Let your user guess until they guess the number
		int num = 10; // Testing purposes
		int userNum = 0;
		while(userNum != randomNumber) {
			 userNum = getInput("Guess the correct number: ");
			if(userNum == randomNumber) {
				// Let them know they won
				System.out.println("You got it!");
				System.out.println("");
			} else if(userNum > randomNumber) {
				// if they guess too high tell them
				System.out.println("Number is too high!");
				System.out.println("");
			} else if(userNum < randomNumber) {
				// if they guess too low tell them
				System.out.println("Number is too low!");
				System.out.println("");
			} else {
//				try {
//					System.out.print("invalid");
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
				System.out.println("Invalid input!");
			}
		}
		scan.close();
	}
	private static int getInput(String prompt) {
		System.out.println(prompt);
		// one word - scan.next();
		int result = scan.nextInt();
		return result;
	}
}