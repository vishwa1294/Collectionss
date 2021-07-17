package com.xworkz.datastore;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dto.RiverDTO;
import com.xworkz.datastore.dao.*;


public class RiverTester {

	public static void main(String[] args) {
		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);
		RiverDTO dto1 = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);

		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println(dao.totalItems());
	  
		RiverDTO kaveriUpdate = new RiverDTO("Kavri", "Talakaveri", 808, 4, true);
		dao.update(kaveriUpdate);
		
		System.out.println("totalItems :"+dao.totalItems());
		
		RiverDTO dtoDelete = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);
		dao.delete(dtoDelete);
		
	}

}




