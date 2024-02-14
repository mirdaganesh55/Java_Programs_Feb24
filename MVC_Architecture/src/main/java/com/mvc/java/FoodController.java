package com.mvc.java;

import java.util.List;

public class FoodController {
	
	private FoodDAOImpl foodDao;
	private Food food;
	
	public FoodDAOImpl getFoodDao() {
		return foodDao;
	}
	public void setFoodDao(FoodDAOImpl foodDao) {
		this.foodDao = foodDao;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	
	// methods
	public List<Food> getFoods(){
		return foodDao.getFoodList();
	}
}
