package com.revature.model;


public class Taco  extends FoodItem {

	//Constructors 
	public Taco() {
		this(3.00);
		System.out.println("Back in no args constructor");
	}
	
	public Taco(double c) {

		this.cost = c; 
	}
	

	@Override
	public String toString() {
		return "Taco [ name=" + name + ", cost=" + cost + "]";
	}

	public boolean isEdible(int days) {
		return days <= 2? true : false; 
	}
}
