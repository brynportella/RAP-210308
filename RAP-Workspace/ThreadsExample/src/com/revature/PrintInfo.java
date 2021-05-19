package com.revature;

public class PrintInfo implements Runnable {

	private final int numberOfThread; 
	
	public PrintInfo(int i) {
		this.numberOfThread = i; 
	}
	
	@Override
	public void run() {
		for (int x = 0; x< 1000; x++) {
			System.out.println("Thread "+numberOfThread+": "+x);
		}
	}
	
}
