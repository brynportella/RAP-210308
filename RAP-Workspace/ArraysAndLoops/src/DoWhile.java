
public class DoWhile {
	public static void main(String[] args) {
		int data = 1; 
		//Print out all even numbers 
		do {
			//What condition to determine if we can print
			if(data % 2 == 0) {
				System.out.println(data);
			}
			//When to add to data?
			data++;
		}while(data<=10);
		
		int easyWay = 2; 
		do {
			System.out.println(easyWay);
			easyWay+=2; 
		}while(easyWay<=10); 
		
		 data = 1;
		do{
			System.out.print(data+1 + " ");
			data+=2;
		}while(data<=10);

	}
}
