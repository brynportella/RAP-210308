package string;

public class UsingStringBuilder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("Hi there"); 
		System.out.println(s.delete(2,3));
	}
}
