
public class ForLoops {
	public static void main(String[] args) {
		int[] intArray = { -1, 0, 1}; 
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(i+" : "+(intArray[i]+8));
		}
		
		//Enhanced for loop
		for(int element: intArray) {
			System.out.println(element);
		}
		int x = 0; 
		for(;;) {
			x++; 
			if(x != 8) {
				System.out.println(x);
				continue; 
			}else if(x==8)  {
				break; 
			}

		}
	}
}
