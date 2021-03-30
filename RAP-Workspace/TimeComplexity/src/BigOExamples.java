import java.util.Arrays;

public class BigOExamples {
	
	public static void main(String[] args) {
		String[] array = {"hi", "hello", "hiya"};
		print(array);
		int[] input = {1,2,3,4,5};
		System.out.println("Result "+binarySearch(input, 7)); 
	}
	
	// O(1)
	public static void print(String[] input) {
		if( input != null && input.length > 0)
			System.out.println(input[0]);
	}
	
	// O( n ) 
	public static void printAll(String[] input ) {
		for(String element: input) { // n 
			System.out.println(element);// 1
			print(input); 
		} 	
	}
	
	public static void printIntMultiplication(int[] array ) {
		//{1,2,3}
		//element = 2
		//currentElement = 3
		for(int element : array) {//n
			for(int currentElement : array) {//n
				System.out.print((element*currentElement)+", ");
			}
			System.out.println("");
		}
		// O(n ^2) 
	}
	
	public static int simpleSearch(int[] array, int input) {
		for(int i = 0; i<array.length; i++) {
			int currentElement = array[i];
			if (currentElement == input)
				return i;
		}
		return -1; 
	}
	
	//{1,2,3,4,5}; //5 
	//midIndex = 2
	//midPoint = 3
	//begin = 1
	//end = 5
	public static int binarySearch(int[] sortedArray, int input) {
		 
		int beginIndex= 0; 
		int endIndex = sortedArray.length;
		System.out.println(Arrays.toString(sortedArray)+" searching for "+input);
		while(beginIndex < endIndex){
			int midIndex = (endIndex + beginIndex)/2; 
			int midpoint;
			if (midIndex < sortedArray.length)
				midpoint= sortedArray[ midIndex];
			else {
				midpoint = 0;
				return -1; 
			}
			System.out.println("BeginIndex = "+ beginIndex+ " EndIndex = "+ endIndex);
			System.out.println("Midpoint = "+midpoint +" midIndex = "+midIndex);
			if(input == midpoint) {
				return midIndex;
			}else if (input>midpoint) {
				beginIndex = midIndex+1; 
			}else {
				endIndex = midIndex;
			}
		}
		return -1; 
		
		
		
	}
	
	
}
