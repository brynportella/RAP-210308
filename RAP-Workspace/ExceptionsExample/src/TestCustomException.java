
public class TestCustomException {
	public static void main(String[] args) {
		try {
			print(); 
		}catch(FridayIsntEverydayException e) {
			System.out.println("We caught Friday isn't every day ");
		}catch(Exception ex) {
			System.out.println("We caught an exception");
			ex.printStackTrace();
			System.exit(1);
		}finally {
			System.out.println("Nearly always runs -- regardless of exceptions");
		}
	}
	
	public static void print() throws FridayIsntEverydayException, Exception{
		//Generate random number either 0 or 1
		int randomNum =0;
		if(randomNum == 0) {
			System.out.println("We're safe.");
		}else {
			throw new FridayIsntEverydayException(); 
		}
		throw new Exception(); 
	}
}
