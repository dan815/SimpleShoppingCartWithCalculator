package com.fdmgroup.CheckoutCalculator;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Item;
import com.fdmgroup.model.ItemTypeEnum;
import com.fdmgroup.util.PriceCalculator;

public class PriceCalculatorTest {

	private Basket basket;
	
	@Before
	public void init() {
		//adding items(fruits)
		//should also enforce prices to be positive only	
		Item apple1 = new Item(1,ItemTypeEnum.APPLE,2.0);
		Item apple2 = new Item(2,ItemTypeEnum.APPLE,2.0);
		Item banana = new Item(3,ItemTypeEnum.BANANA,1.0);
		Item peach = new Item(4,ItemTypeEnum.PEACH,2.20);
		Item orange = new Item(5,ItemTypeEnum.ORANGE,1.90);
		Item lemon = new Item(6,ItemTypeEnum.LEMON,3.12);
		List<Item> itemList = Arrays.asList(apple1,apple2,banana,peach,orange,lemon);
		basket = new Basket(itemList);
	}
	
	
	
	@Test
	public void test_price_calculation_of_empty_basket() {
		Basket basket = new Basket();
		assertEquals(PriceCalculator.getBasketPrice(basket),0.0,0.002);
	}
	
	@Test
	public void test_price_calculation_of_basket__with_items() {
		assertEquals(PriceCalculator.getBasketPrice(basket),12.22,0.002);
	}
	
/* Unimplemented test case, but something that could also be considered.
	@Test
	public void test_price_calculation_of_basket__with_items_with_very_large_prices() {
		Item orange = new Item(5,ItemTypeEnum.ORANGE,Integer.MAX_VALUE);
		Item lemon = new Item(6,ItemTypeEnum.LEMON,Integer.MAX_VALUE);
		
		List<Item> itemList = Arrays.asList(orange,lemon);
		basket = new Basket(itemList);
		//should throw custom exception
		PriceCalculator.getBasketPrice(basket);
		
	}
*/
	
}
