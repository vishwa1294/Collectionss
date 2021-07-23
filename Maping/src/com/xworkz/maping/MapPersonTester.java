package com.xworkz.maping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapPersonTester {
	public static void main(String[] args) {
		Map<String, String>nameAndFavouriteFoodMap=new HashMap<String, String>();
		nameAndFavouriteFoodMap.put("Vaishnavi","Panipuri");
		nameAndFavouriteFoodMap.put("Pavitra","Gobi");
		nameAndFavouriteFoodMap.put("Sunita", "Dal");
		nameAndFavouriteFoodMap.put("Ranjitha", "Rice");
		nameAndFavouriteFoodMap.put("Girija", "Rotti");
		nameAndFavouriteFoodMap.put("Sachin", "Chiken");
		nameAndFavouriteFoodMap.put("Mridula", "Fish");
		nameAndFavouriteFoodMap.put("Sunil", "Idli");
		nameAndFavouriteFoodMap.put("Anupama", "Omlet");
		nameAndFavouriteFoodMap.put("Vinay", "Dosa");
		System.out.println(nameAndFavouriteFoodMap.size());
		System.out.println(nameAndFavouriteFoodMap.containsKey("Anupama"));
		System.out.println(nameAndFavouriteFoodMap.containsValue("Omlet"));
		
		
		
		Set<String>keySet = nameAndFavouriteFoodMap.keySet();
		Iterator<String> itr=keySet.iterator();
		while(itr.hasNext()) {
			String string=itr.next();
			String value=nameAndFavouriteFoodMap.get(string);
			System.out.println(string+" "+value);
			
			}
	}

}
