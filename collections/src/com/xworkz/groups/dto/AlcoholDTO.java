package com.xworkz.groups.dto;

import java.io.Serializable;

import com.xworkz.groups.constants.AlcoholType;

public class AlcoholDTO implements Serializable, {
	private String brand;
	private int price;
	private String scotch;
	private boolean quantity;
	private AlcoholType Type;
	
	public AlcoholDTO() {
		
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", AlcoholType=" + Type + "]";
	}
	@Override
	public int compareTo(AlcoholDTO other) {
		int brandOfOther=other.getBrand();
		if(this.brand==priceOfOther)return 0;
		if(this.price>priceOfOther)return -1;
		if(this.price<priceOfOther)return 1;
		return 0;
		
	}
	public AlcoholDTO(String brand, int price, String scotch, boolean quantity, AlcoholType Type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.Type= Type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String isScotch() {
		return scotch;
	}

	public void setScotch(String scotch) {
		this.scotch = scotch;
	}

	public boolean isQuantity() {
		return quantity;
	}

	public void setQuantity(boolean quantity) {
		this.quantity = quantity;
	}

	public AlcoholType isType() {
		return Type;
	}

	public void setType(AlcoholType type) {
		this.Type = type;
	}
	
	
	
	
}
