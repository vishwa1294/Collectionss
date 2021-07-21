
package com.xworkz.datastore.dto;

import java.util.Collection;

import com.xworkz.datastore.dao.KitchenItemDAO;
import com.xworkz.datastore.dao.KitchenItemDAOImpl;

public class KitchenItemDTOTester {

	public static void main(String[] args) {
		KitchenItemDTO dto1 = new KitchenItemDTO("Mixie", 850, "Grinding", "Stainless steel");
		KitchenItemDTO dto2 = new KitchenItemDTO("Teapot", 20, "Peeling", "Plastic");
		KitchenItemDTO dto3 = new KitchenItemDTO("Spatula", 350, "String", "Stainless Steel");

		
		KitchenItemDAO dao = new KitchenItemDAOImpl();
		
		dao.saveUnique(dto3);
		dao.saveUnique(dto2);
		dao.saveUnique(dto1);
		
		Collection<KitchenItemDTO> collection1 = dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchenItem : collection1) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByUsedFor());
		Collection<KitchenItemDTO> collection2 = dao.findAllSortByUsedForDesc();
		for (KitchenItemDTO kitchenItem : collection2) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByUsedForDesc());
		Collection<KitchenItemDTO> collection3 = dao.findAllSortByName();
		for (KitchenItemDTO kitchenItem : collection3) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByName());
		Collection<KitchenItemDTO> collection4 = dao.findAllSortByPriceDesc();
		for (KitchenItemDTO kitchenItem : collection4) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByPriceDesc());
		
	}

}
