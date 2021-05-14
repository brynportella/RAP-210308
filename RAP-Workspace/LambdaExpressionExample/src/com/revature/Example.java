package com.revature;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example {
	
	public void printItems(ArrayList<String> strings) {
		//strings.forEach( x-> System.out.println(x));
		
		strings.forEach((String x) -> {
			System.out.println(x);
		} );
	}
	
	public String getList(ArrayList<String> strings) {
		StringBuffer y = new StringBuffer("");
		strings.forEach( x-> y.append(x+" "));
		return y.toString(); 
	}
	
	public void print(String input) {
		Consumer<String> stringConsumer =  (x) -> {
				System.out.println(x);
			};	
		
		stringConsumer.accept(input); 
	}
	
	
}
