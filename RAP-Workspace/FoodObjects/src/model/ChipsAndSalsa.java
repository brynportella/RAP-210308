package model;

import game.Player;

public class ChipsAndSalsa extends FoodItem implements Tossable{
	//THIS IS INHERITED ___ DONT SHADOW IT OR HIDE IT 
	//double cost;
	
	public String getName() {
		return super.getName()+" CHIPS AND SALSA";
	}
	
	
	
	@Override
	public String toString() {
		return "ChipsAndSalsa [name=" + name + ", cost=" + cost + "]";
	}



	@Override
	public void printStuff() {
		System.out.println("Work!");
	}
	
	public boolean isEdible(int days) {
		return days <= 6? true : false; 
	}



	@Override
	public void toss() {
		System.out.println("tossing- chips and salsa go everywhere");
		
	}

	@Override
	public void toss(Player target) {
		int randomNumberBetweenTen = (int)Math.random()*10;
		if(randomNumberBetweenTen < 1) {
			System.out.println("We hit the player and they caught the item!!");
			target.addFoodToInventory(this);
		}else if(randomNumberBetweenTen< 3) {
			System.out.println("What a mess-- you hit the player!!");
		}else {
			System.out.println("A swing and a miss.");
		}
	}
	
	
}
