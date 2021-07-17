package com.xworkz.itemdelivery.flipkart.courierservice;

import  com.xworkz.itemdelivery.ItemDelivery;


public class CourierService implements  ItemDelivery  {
	
	private  String name;
	private int totalLocation;
	private boolean internationalDeliver;

	public CourierService(String name, int totalLocation, boolean internationalDeliver) {
		System.out.println("created courier service constructor");
		this.name = name;
		this.totalLocation = totalLocation;
		this.internationalDeliver = internationalDeliver;
		System.out.println(this.name);
		System.out.println(this.totalLocation);
		System.out.println(this.internationalDeliver);
	}

	@Override
	public int pickItem() {
		System.out.println("total items picked");
		return 30;
	}

	@Override
	public int dropItem() {
		System.out.println("total items droped");
		return 50;
	}
}

