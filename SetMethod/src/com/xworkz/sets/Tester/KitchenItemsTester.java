package com.xworkz.sets.Tester;

import java.util.TreeSet;

import com.xworkz.set.dao.KitchenItemDAO;
import com.xworkz.set.dao.KitchenItemDAOImpl;
import com.xworkz.sets.dto.KitchenItemsDTO;

public class KitchenItemsTester {

	public static void main(String[] args) {

		KitchenItemsDTO dto = new KitchenItemsDTO("Teapot", 20, "Peeling", "Plastic");
		KitchenItemsDTO dto1 = new KitchenItemsDTO("Spatula", 350, "String", "Stainless Steel");

		KitchenItemsDTO dto2 = new KitchenItemsDTO("Knife", 150, "cutting", "Steel");

		KitchenItemDAO dao = new KitchenItemDAOImpl();
		TreeSet<KitchenItemsDTO> ref = new TreeSet<KitchenItemsDTO>();

		dao.saveUnique(dto2);
		dao.saveUnique(dto);
		dao.saveUnique(dto1);
		
		System.out.println(dao.findAllSortbyUsedFor());
		
	}

}
