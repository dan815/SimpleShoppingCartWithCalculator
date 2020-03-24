package com.fdmgroup.model;

public class Item {
	private int id;
	private ItemTypeEnum type; 
	private double price;
	
	public Item(int id, ItemTypeEnum type, double price) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}


	public ItemTypeEnum getType() {
		return type;
	}


	public void setType(ItemTypeEnum type) {
		this.type = type;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	//overriding equals method for easy removal
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null ||this.getClass()!=o.getClass()){
			return false;
		}
		Item comparedItem = (Item) o;
		return this.id == comparedItem.id 
				&& comparedItem.type == this.type;
	
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
