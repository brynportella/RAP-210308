package math;

public class UsingMath {
	public static void main(String[] args) {
		
		//abs
		//static method  from the Math class
		// 15 as our argument
		int result = Math.abs(-15);
		System.out.println(result);
		//floor method
		// 18.5 
		//store in result 
		result = (int)Math.floor(18.5);
		System.out.println(result);
		
		result = Math.max(-10, 9); 
		System.out.println(result);
		
		result = Math.min(10, 5);
		System.out.println(result);
		
		double resultDouble = Math.sqrt(4.0); 
		System.out.println(resultDouble);
		
		resultDouble = Math.floor(-18.01); 
		System.out.println(resultDouble);
		
		resultDouble = Math.ceil(19.1); 
		System.out.println(resultDouble);
		//0- 99 
		//Math.floor(Math.random*100)
		
		//min - max : 1- 100 
		//range = max - min + 1 
		
		//Math.floor(Math.random* (range))+ min
		
		double randomNumber = Math.floor(Math.random()*100); 
		System.out.printf("%.2f\n",randomNumber);

	}
}
