package com.rasmus.app.vending.mod;

public class Food extends Products {

	private int calories;

	public Food(String name, int price, int calories) {
		super(name, price);
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}
	
	public String examine(){
		return this.getName() + " " + getPrice() + " " + getCalories();
	}

	@Override
	void purchase(int money, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String use() {
		return "";
	}
	
}
