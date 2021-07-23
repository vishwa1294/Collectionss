package com.xworkz.maping;

import java.util.Collection;

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
		Collection<String> values = nameAndFavouriteFoodMap.values();

		System.out.println("Food printing");
		Iterator<String> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			String str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("***");
		System.out.println("Name printing");
		Iterator<String> itrvalue = keySet.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("***");
		System.out.println("Name & Food printing");
		Iterator<String> itr1 = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			String value = nameAndFavouriteFoodMap.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("XXXX");
		nameAndFavouriteFoodMap.remove("pavitra");
		System.out.println(nameAndFavouriteFoodMap.size());
	}

}
	