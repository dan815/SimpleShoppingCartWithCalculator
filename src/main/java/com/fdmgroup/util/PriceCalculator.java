package com.fdmgroup.util;

import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Item;

public class PriceCalculator {
	public static double getBasketPrice(Basket basket) {
//		double basketPrice = basket.getBasketList()
//		.stream()
//		.mapToDouble(e -> ((Item)e).getPrice())
//		.sum();
//		return basketPrice;
		
		double minPrice = Double.MAX_VALUE;
		double sum = 0 ;
		for(Item i : basket.getBasketList()) {
			if(i.getPrice()<minPrice) {
				minPrice=i.getPrice();
			}
			sum+=i.getPrice();	
		}
		double totalPrice = sum-minPrice;
		//To cover the case when only 1 item is purchased
		//or this discount should not be included for just one purchase!
		//In which case we must do a check to see if basket.getBasketList().size()>2
		if(totalPrice < 0) {
			return 0;
		}
		return totalPrice;
	}
}
