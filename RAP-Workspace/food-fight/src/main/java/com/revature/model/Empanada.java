package com.revature.model;


//How do I make this have an IS- A relationship with FoodItem?
public class Empanada extends FoodItem{

	
	//What constructor is here implicitly?
	public Empanada() {
		super(); 
		System.out.println("In empanada constructor");
	}

	@Override
	public String toString() {
		return "Empanada [name=" + name + ", cost=" + cost + "]";
	}
	
	public boolean isEdible(int days) {
		return days <= 3? true : false; 
	}
}
