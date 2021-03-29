import java.util.Arrays;

public class BigOExamples {

	public static void main(String[]args) {
		// Set the string array and load it with data
		String[] array = {"hi", "hello", "hiya"};
		print(array);
		int[] input = {1,2,3,4,5};
		System.out.println("Result: " + binarySearch(input, 5));
		
	}
	// O(1) - Constant time/doesn't matter how many inputs, 
	// will always be constant regardless of the amount of inputs
	// Has 3 items but will always print 1 or index 0 of an array
	public static void print(String[] input) {
		// Checks if it is null first then it checks it the length is greater than 0
		if(input != null && input.length > 0) 
			// If true, it prints the first index of the array
			System.out.println(input[0]);
	}
	
	// O(n) - O(1 * n) - Linear Time
	// Enhanced for loop
	public static void printAll(String[]input) {
		for(String element: input) { // n
			System.out.println(element); // 1 instruction
			print(input);
		}
		// Still one operation
		print(input);
	}
	
	// O(n^2) - You will get n^2 any time you have a nested for-loop - Quick Sort
	public static void printIntMultiplication(int[]array) {
		// {1,2,3}
		// element = 1, = 2, = 3
		// currentElement = 1, = 2, = 3
		for(int element : array) {// n
			for(int currentElement : array) { // n
				System.out.print((element*currentElement)+", ");
			}
			System.out.println("");
		} // Output
		// 1, 2, 3,
		// 2, 4, 6,
		// 3, 6, 9,
		// n * n * 1 + n*1
		// n^2 + n
		// O(n^2) - quadratic 
	}
	
	// Linear Search
	public static int simpleSearch(int[] array, int input) {
		for(int i = 0; i < array.length; i++) {
			int currentElement = array[i];
			if(currentElement == input)
				return i;
		}
		return -1;
	}
	
	// Binary Search
	public static int binarySearch(int[] sortedArray, int input) {
		// Integer division - will always give you the middle index
		// int midPoint = sortedArray[sortedArray.length/1];
		// Need to know these
		int beginIndex = 0;
		int endIndex = sortedArray.length;
		System.out.println(Arrays.toString(sortedArray) + "searching for " + input);
		System.out.println("BeginIndex = " + beginIndex + " EndIndex = " + endIndex);
		
		while(beginIndex < endIndex) {
			
			int midIndex = (endIndex + beginIndex)/2; // 2
			int midPoint = sortedArray[midIndex];
			System.out.println("BeginIndex = " + beginIndex + " EndIndex = " + endIndex);
			System.out.println("MidPoint = " + midPoint + " MidIndex = " + midIndex);
			// Check if the input is less than the midpoint 
			if(input == midPoint) {
				return midIndex;
			} else if(input > midPoint) {
				beginIndex = midIndex; 
			} else {
				endIndex = midIndex + 1; // 1
			}
		
		} // While loop
		return -1;
	}
}
