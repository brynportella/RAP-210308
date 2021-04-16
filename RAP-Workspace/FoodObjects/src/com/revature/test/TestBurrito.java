package com.revature.test;

import com.revature.model.Burrito;

public class TestBurrito {
	public static void testCut(Burrito b) {
		try {
			b.cutOpen();
		} catch(Exception e1) {
			e1.printStackTrace();
			System.out.println("You can't cut open a burrito");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Burrito b = new Burrito();
		TestBurrito.testCut(b);
	}
}
