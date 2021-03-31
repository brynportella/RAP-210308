import java.util.Arrays;

public class SortingArrays {
	
	public static void main(String[] args) {
		int [] array = {52, 33, 99, 20, 11,55}; 
		bubbleSort(array);
		//selectionSort(array); 
		System.out.println(Arrays.toString(array));
	}
	
	
	
	//{8, 21, 74, 33}
	//minIndex = 2
	//i = 1
	// j = 4
	//larger = 74
	private static void selectionSort(int[] arr) {
		// for each element in the unsorted array…
		for (int i = 0; i < arr.length - 1; i++) {
			// find the index of the smallest value
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			// swap the value at the current index and the index of
			// the smallest value
			int larger = arr[i]; // save the old/larger value
			arr[i] = arr[minIndex]; // move the smaller value forward
			arr[minIndex] = larger; // move the larger value back

		}
	}
	
	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			System.out.println("OUTERLOOP:Array is currently: "+Arrays.toString(array));
			for (int j = 0; j < array.length-i-1; j++) {
		    	if (array[j] > array[j+1]) { 
		    		// swap array[j+1] and array[i] 
					System.out.println("Swapping "+(j+1)+":"+ array[j+1]+" "+j+":"+array[j]);
					int temp = array[j]; 
					array[j] = array[j+1]; 
					array[j+1] = temp; 
					System.out.println("Array is currently: "+Arrays.toString(array));
		    	}
			}
		}
	}
}