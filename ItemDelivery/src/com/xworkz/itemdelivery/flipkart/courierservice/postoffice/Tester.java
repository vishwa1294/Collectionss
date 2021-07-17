package com.xworkz.itemdelivery.flipkart.courierservice.postoffice;

import  com.xworkz.itemdelivery.ItemDelivery;
import  com.xworkz.itemdelivery.flipkart.courierservice.CourierService;
import  com.xworkz.itemdelivery.flipkart.courierservice.postoffice.PostOfficeService;
import com.xworkz.itemdelivery.flipkart. Flipkart;

public class Tester {
	public static void main(String[] args) {

		ItemDelivery deliver = new CourierService("standard", 20, true);

		Flipkart kart = new Flipkart();
		kart.setRule(deliver);

		ItemDelivery deliver1 = new PostOfficeService(583115);
		kart.setRule(deliver1);

	}

}
