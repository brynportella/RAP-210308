package com.revature.model;

import java.util.ArrayList;

public class Player extends User {
	//inventory variable 
	//array of FoodItem objects 
	private ArrayList<FoodItem> inventory = new ArrayList<FoodItem>();
	private int stamina; 
	private int balance; 
	private int cleanliness; 
	
	public ArrayList<FoodItem> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<FoodItem> inventory) {
		this.inventory = inventory;
	}
	
	public int getNumFoodItems() {
		return inventory.size();
	}
	
	public void addFoodToInventory(FoodItem item) {
		this.inventory.add(item);
	}
	
	public boolean inventoryIsFull() {
		return false; 
	}
	
	//Get an item from my inventory-- 
	//check if it can be tossed 
	//toss the item 
	public void tossItem(int positionInInventory) {
		if(positionInInventory < inventory.size() ) {
			FoodItem item = inventory.get(positionInInventory);
			if( item instanceof Tossable) {
				Tossable tossableRef = (Tossable) item; 
				tossableRef.toss();
				inventory.remove(positionInInventory); 
			}else {
				System.out.println("That item can't be tossed!!");
			}
		}else {
			System.out.println("There is nothing at that position. ");
		}
	}
	
}
