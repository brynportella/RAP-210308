package example;

import two.ReturnMethods;

public class MethodTester {
	public static void main(String[] args) {
		//Invoking or running or calling the fun static method
		MethodTester.fun();
		fun(); 
		//Invoke sum with 7, 8 
		ReturnMethods.sum(7, 8); 
	}
	public static void fun() {
		System.out.println("FUN!!!");
	}
}
