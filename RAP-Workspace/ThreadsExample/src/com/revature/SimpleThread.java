package com.revature;

public class SimpleThread extends Thread {

	@Override
	public void run() {
	
		for (int x = 0; x< 1000; x++) {
			System.out.println("Thread "+this.getId() +": "+x);
		}
	}

	
}
