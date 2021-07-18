package com.xworkz.datastore;


import com.xworkz.datastore.dao.TempleDAO;

import com.xworkz.datastore.dto.TempleDTO;

import com.xworkz.datastore.dao.TempleDAOImpl;


public class TempleTester {

	public static void main(String[] args) {
		
		TempleDTO dto = new TempleDTO("Banashankari temple",20, "KumarSwamyLayout",10,"Bisibelebhat", 2, true,"Banashankari",true);
		TempleDTO dto1 = new TempleDTO("Iscon temple",30, "Kacharakanahalli", 100, "CurdRice",5,true,"Krishna",false);
		TempleDTO dto2 = new TempleDTO("Shiva temple",10, "BijapuRoad", 100, "CurdRice",6,false,"Shiva",false);
		TempleDTO dto3 = new TempleDTO("Danamma temple",50, "Guddapur", 100, "Rice",10,true,"Danamma",true);
		TempleDTO dto4 = new TempleDTO("Sangi temple",40, "Hydrabadroad", 20, "Laddu",8,true,"Krishna",false);
		

		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.totalItems();
		dao.findFirstItem();
		dao.findLastItem();

		
		TempleDTO dtoDelete = new TempleDTO("Banashankari",20, "KumarSwamyLayout",10,"Bisibelebhat", 2, true,"Banashankari",true);
		dao.delete(dtoDelete);
		
		TempleDTO findbyName =dao.findBYName("Iscon");
		System.out.println("findbyName:"+findbyName);

		TempleDTO findbyLocation=dao.findByLocation("BijapuRoad");
		System.out.println("find by Location: "+findbyLocation);
		
		TempleDTO findbyLocationAndName=dao.findByLocationAndName("Shiva temple","BijapuRoad");
		System.out.println("find by LocationAndName: "+findbyLocationAndName);
		
dao.findAll();
dao.findAllTempleByEntryFeeGreaterThan(150.00d);
dao.findAllTempleByNoOFPoojarisGreaterThan(15);
}
}



		
	


