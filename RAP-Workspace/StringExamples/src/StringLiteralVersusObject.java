
public class StringLiteralVersusObject {
	public static void main(String[] args) {
		String a = "Hi"; 
		String b = "Hi"; 
		String c = new String("Hiyaaa there"); 
		
		//Best practice for comparing strings
		if(a.equals(c)) {
			System.out.println("Same");
		}
		
		System.out.println(c.substring(3, c.length()));
		System.out.println(c.charAt(5));
		
		System.out.println(c.indexOf('e', 10));
		String[] ex = "Hey hi hello".split(" ");
		//{"hey", "hi", "hello"}
		
		System.out.println(
				String.format("\nInteger: %1$08d, \nBoolean: %2$b"
				+ ",\nDecimal: %3$8.2f, \nString: %4$s"
						, 5011, true, 12.95, "Hi there"));
	}
}
