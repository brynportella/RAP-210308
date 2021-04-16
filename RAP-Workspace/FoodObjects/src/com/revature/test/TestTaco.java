package com.revature.test;

import com.revature.model.Empanada;
import com.revature.model.Taco;

public class TestTaco {
	//Unused variables are intentional for learning
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Taco bell; 
		//initialized our bell reference variable
		//by instantiating our Taco class
		//to instantiate a class you create an object from that class. 
		bell = new Taco("beef", "flour", 1.00); 
		
		bell.setFlavor("veggies");
		bell.setCost(2.00);
		
		System.out.println("Bell: flavor="+bell.getFlavor()
				+" tortilla="+bell.getTortilla()+" cost ="+bell.getCost());
		
		Taco a = new Taco();
		
		//Create a ChipsAndSalsa object and store in variable called cas 
		//ChipsAndSalsa cas = new ChipsAndSalsa(); 
		
		//System.out.println(cas.getName());
		//System.out.println(cas);
		
		Empanada e = new Empanada(); 
		
		
		Double b = 2.0;
		Float anotherVariable = 9.0f; 
	}
}
