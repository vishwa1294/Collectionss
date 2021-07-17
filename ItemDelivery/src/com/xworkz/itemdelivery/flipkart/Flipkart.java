package com.xworkz.itemdelivery.flipkart;

import com.xworkz.itemdelivery.ItemDelivery;

public class Flipkart {
	private ItemDelivery delivery;
	
	public Flipkart() {
		System.out.println("invoked Flipkart constructor()");
	}

	public void deliverProduct() {
		System.out.println("product delivered");
		int temp1 = this.delivery.dropItem();
		System.out.println(temp1);
	}

	public void returnProduct() {
		System.out.println("return product");
		int temp = this.delivery.pickItem();
		System.out.println(temp);
	}

	public void setRule(ItemDelivery delivery) {
		this.delivery = delivery;
		this.returnProduct();
		this.deliverProduct();
	}

}
