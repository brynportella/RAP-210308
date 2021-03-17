package two;

public class ReturnMethods {
	public static void main(String[] args) {
		int resultOfSum = ReturnMethods.sum(4, 6); 
		System.out.println(resultOfSum); 
	}
	
	public static int sum(int a, int b) {
		int result = a + b; 
		return result; 
		//System.out.println("Here");
	}
}
