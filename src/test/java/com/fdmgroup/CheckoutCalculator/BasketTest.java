package com.fdmgroup.CheckoutCalculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Item;
import com.fdmgroup.model.ItemTypeEnum;

public class BasketTest {
	@Test
	public void test_adding_basket_for_one_item() {
		Item apple1 = new Item(1, ItemTypeEnum.APPLE, 2.0);
		Basket basket1 = new Basket();
		basket1.addItem(apple1);
		assertEquals(basket1.getBasketList().size(), 1);
	}

	@Test
	public void test_adding_basket_items_with_same_id_items() {
		Item apple1 = new Item(1, ItemTypeEnum.APPLE, 2.0);
		Item apple2SameId = new Item(1, ItemTypeEnum.APPLE, 2.0);
		Basket testBasket = new Basket();
		testBasket.addItem(apple1);
		testBasket.addItem(apple2SameId);
		assertEquals(testBasket.getBasketList().size(), 1);
	}

	@Test
	public void test_adding_multiple_basket_items() {
		Item apple1 = new Item(1, ItemTypeEnum.APPLE, 2.0);
		Item banana1 = new Item(2, ItemTypeEnum.BANANA, 2.0);
		Basket testBasket = new Basket();
		testBasket.addItem(apple1);
		testBasket.addItem(banana1);
		assertEquals(testBasket.getBasketList().size(), 2);
	}

	@Test
	public void test_remove_basket_items() {
		Item apple1 = new Item(1, ItemTypeEnum.APPLE, 2.0);
		Item banana1 = new Item(2, ItemTypeEnum.BANANA, 2.0);
		
		List<Item> itemList = new ArrayList();
		itemList.add(apple1);
		itemList.add(banana1);

		Basket testBasket = new Basket(itemList);
		
		testBasket.removeItem(apple1);
		assertEquals(testBasket.getBasketList().size(), 1);
	}
}
