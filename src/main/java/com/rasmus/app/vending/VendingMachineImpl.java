package com.rasmus.app.vending;

import java.util.Arrays;

import com.rasmus.app.vending.mod.Products;
import com.rasmus.app.vending.mod.Vendingmachine;

public class VendingMachineImpl implements Vendingmachine{
	
	private int[] denominations = {1,5,10,20,50,100,500,1000};
	Products[] products;
	int moneyPool = 0;
	
	@Override
	public boolean addMoney(int money) {
		boolean isIn = contains(money);
	    if(isIn){
	    	moneyPool = moneyPool + money;
	    	return true;
	    }else{
	    	System.out.println("You cannot deposit that in the machine");
	    	return false;
	    }
	}
	
	
	public boolean contains(int money) {
//	   if(Arrays.stream(denominations).anyMatch(i -> i == money)){
//		   return true;
//	   }else{
//		   return false;
//	   }

		 return Arrays.stream(denominations).anyMatch(i -> i == money);
	}
	
	
}
