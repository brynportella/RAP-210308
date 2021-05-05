package com.revature.dao;

import com.revature.model.FoodItem;

public interface FoodItemDAO {
	/**
	 * createFoodItem
	 * updateFoodItem
	 * getAllFoodItemsForPlayer
	 * getAllFoodItemsOfType
	 * deleteFoodItem
	 */

	public boolean createFoodItem(FoodItem item);
	public boolean updateFoodItem(FoodItem olditem, FoodItem newItem);
	
}
