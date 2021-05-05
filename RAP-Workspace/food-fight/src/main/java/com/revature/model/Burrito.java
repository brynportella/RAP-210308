package com.revature.model;


class CutBurritoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

public class Burrito extends FoodItem implements Tossable {
	
	public void cutOpen() throws CutBurritoException {
		throw new CutBurritoException();
	}
	
	@Override
	public boolean isEdible(int days) {
		// TODO Auto-generated method stub
		if (days > 1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void toss() {
		// TODO Auto-generated method stub
		System.out.println("You threw the burrito");
		
	}

	@Override
	public void toss(Player target) {
		int randomNumberBetweenTen = (int)Math.random()*10;
		if(randomNumberBetweenTen < 1) {
			System.out.println("We hit the player and they caught the item!!");
			target.addFoodToInventory(this);
		}else if(randomNumberBetweenTen< 7) {
			System.out.println("What a mess-- you hit the player!!");
		}else {
			System.out.println("A swing and a miss.");
		}
		
	}

}
