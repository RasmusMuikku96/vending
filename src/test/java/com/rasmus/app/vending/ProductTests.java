package com.rasmus.app.vending;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rasmus.app.vending.mod.Drink;
import com.rasmus.app.vending.mod.Food;
import com.rasmus.app.vending.mod.Snack;

public class ProductTests {
	public Food testFood;
	public Drink testDrink;
	public Snack testSnack;
	
	@Before
	public void init(){
		testFood = new Food("Testfood", 5, 200);
		testDrink = new Drink("Testdrink", 10, "200ml");
		testSnack = new Snack("Testsnack", 15, 20);
	}
    
	@Test
	public void Test_Food_Examine(){
		String expected = "Testfood 5 200";
		Assert.assertEquals(expected, testFood.examine());
	}
	
	@Test
	public void Test_Food_getName(){
		String expected = "Testfood";
		Assert.assertEquals(expected, testFood.getName());
	}
	
	@Test
	public void Test_Drink_Examine(){
		String expected = "Testdrink 10 200ml";
		Assert.assertEquals(expected, testDrink.examine());
	}
	@Test
	public void Test_Drink_getName(){
		String expected = "Testdrink";
		Assert.assertEquals(expected, testDrink.getName());
	}
	
	@Test
	public void Test_Snack_Examine(){
		String expected = "Testsnack 15 20";
		Assert.assertEquals(expected, testSnack.examine());
	}
	
}
