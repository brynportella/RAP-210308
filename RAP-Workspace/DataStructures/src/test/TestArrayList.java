package test;

import model.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(); 
		
		a.add(3);
		a.add(4);
		a.add(3);
		
		System.out.println(a);
		
		int value = a.remove(); 
		System.out.println(a);
		System.out.println("Removed :"+value);
		
		value = a.remove(); 
		System.out.println(a);
		System.out.println("Removed :"+value);
		
		value = a.remove(); 
		System.out.println(a);
		System.out.println("Removed :"+value);

		
		value = a.remove(); 
		System.out.println(a);
		System.out.println("Removed :"+value);


	}
}
