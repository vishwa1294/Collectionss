package com.xworkz.itemdelivery.flipkart.courierservice.postoffice;

import com.xworkz.itemdelivery.ItemDelivery;

public class PostOfficeService implements ItemDelivery {

	int pincode;

	public PostOfficeService(int pincode) {
		System.out.println("created postoffice service constructor");
		this.pincode=pincode;
		System.out.println("pin code" + this.pincode);
	}

	@Override
	public int pickItem() {
		System.out.println("pick item");
		return 5;
	}

	@Override
	public int dropItem() {
		System.out.println("drop item");
		return 2;
	}

}
