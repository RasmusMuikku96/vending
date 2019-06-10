package com.rasmus.app.vending.mod;

public class Drink extends Products{

	private String volume;

	public Drink(String name, int price, String volume) {
		super(name, price);
		this.volume = volume;
	}

	public String getVolume() {
		return volume;
	}

	@Override
	void purchase(int money, String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public String examine() {
		return this.getName() + " " + getPrice() + " " + getVolume();
	}

	@Override
	public String use() {
		return "You drank " + this.getName();
		
	}

	
	
}
