package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Item> basketList = new ArrayList<Item>();
		
	public Basket() {
		super();
	}

	public Basket(List<Item> basketList) {
		this.basketList = basketList;
	}


	public void addItem(Item item) {
		//add only if item doesn't already exist in basket
		if(basketList.contains(item)) {
			System.out.println("This item is already in basket");
			return;
		}
		basketList.add(item);
	}
	
	public void removeItem(Item item) {
		if(basketList.contains(item)) {
			boolean remove = basketList.remove(item);
			System.out.println(remove);
			return;
		}
		System.out.println("This item doesn't exist in basket");
	}
	
	public List<Item> getBasketList(){
		return basketList;
	}
	
}
