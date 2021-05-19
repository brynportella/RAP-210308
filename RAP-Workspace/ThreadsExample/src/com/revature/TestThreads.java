package com.revature;

public class TestThreads {
	public static void main(String[] args) {
		//Create new threads using extension of the thread class
		//Thread thread1 = new SimpleThread(); 
		//Thread thread2 = new SimpleThread(); 
		
		//Create thread via instance of Runnable 
		Thread thread1 = new Thread( new PrintInfo(1));
		
		thread1.start(); 
		
		//Lambda expression to create a thread
		Thread thread2 = new Thread( () -> {
			for (int x = 0; x< 1000; x++) System.out.println(x);
		});
		thread2.start();
		try {
			System.out.println("Thread being paused:"+Thread.currentThread()); 
			Thread.sleep(300);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		for(int x = 0; x< 1000; x++) {
			System.out.println(Thread.currentThread()+" : "+x);
		}
	}
	
}
