package example;

public class ParameterMethods {
	//PASS BY VALUE PRIMITIVES
	public static void main(String[] args) {
		int x = 10; 
		ParameterMethods.printX(x); 
		System.out.println(x);
	}
	
	public static void printX(int a) {
		System.out.println(a);
		a = 90; 
	}
}
