package com.rasmus.app.vending.mod;

public class Snack extends Products{

	private int sugarAmount;

	public Snack(String name, int price, int sugarAmount) {
		super(name, price);
		this.sugarAmount = sugarAmount;
	}

	public int getSugarAmount() {
		return sugarAmount;
	}

	@Override
	void purchase(int money, String name) {
		
		use();
	}

	@Override
	public String examine() {
		return this.getName() + " " + getPrice() + " " + getSugarAmount();
	}

	@Override
	public String use() {
		return "You just consumed " + getName();
	}
	
	
	
}
