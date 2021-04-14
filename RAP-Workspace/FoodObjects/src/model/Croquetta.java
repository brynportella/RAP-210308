package model;

import game.Player;

public class Croquetta extends FoodItem implements Tossable{



	@Override
	public String toString() {
		return "Croquetta [name=" + name + ", cost=" + cost + "]";
	}
	

	@Override
	public boolean isEdible(int days) {
		return days <= 5? true : false; 
	}
	
	@Override
	public void toss() {
		System.out.println("tossing- croquettas go everywhere");
		
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
