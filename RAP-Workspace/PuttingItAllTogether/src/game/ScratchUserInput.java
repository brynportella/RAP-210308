package game;

import java.util.Scanner;

public class ScratchUserInput {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// asking the user their name and save it in a variable
		// called name
		String name = getInput("Give me your name");
		System.out.println("Nice to meet you, " + name);
	}

	private static String getInput(String prompt) {
		System.out.println(prompt);
		// one word scan.next();
		String result = scan.nextLine();
		return result;
	}
}
