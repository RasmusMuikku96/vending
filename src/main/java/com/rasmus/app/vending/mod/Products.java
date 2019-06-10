package com.rasmus.app.vending.mod;

public abstract class Products {

	private String productName;
	private int price;
	
	public Products(String name, int price) {
		super();
		this.productName = name;
		this.price = price;
	}

	abstract void purchase(int money, String name);
	public abstract String examine();
	public abstract String use();

	public String getName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
	
}

