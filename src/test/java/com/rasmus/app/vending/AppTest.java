package com.rasmus.app.vending;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rasmus.app.vending.mod.Drink;
import com.rasmus.app.vending.mod.Food;
import com.rasmus.app.vending.mod.Vendingmachine;

public class AppTest{ 
	
	public Food testFood;
	public Drink testDrink;
	public VendingMachineImpl VM;
	
	@Before
	public void init(){
		VM = new VendingMachineImpl();
	}
	
	@Test
	public void Test_VendingMachineImpl_AddMoney(){
		int expected = 20;
		VM.addMoney(20);
		Assert.assertEquals(expected, VM.moneyPool);
	}
	
	@Test
	public void Test_Isin_Denominations(){
		Assert.assertTrue(VM.contains(20));
		Assert.assertFalse(VM.contains(21));
	}
	
	
	
}
