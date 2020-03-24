package com.fdmgroup.util;

import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Item;

public class PriceCalculator {
	public static double getBasketPrice(Basket basket) {
		double basketPrice = basket.getBasketList()
		.stream()
		.mapToDouble(e -> ((Item)e).getPrice())
		.sum();
		return basketPrice;
	}
}
