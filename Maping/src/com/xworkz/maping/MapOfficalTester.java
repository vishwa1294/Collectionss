package com.xworkz.maping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapOfficalTester {

	public static void main(String[] args) {
		Map<String,Integer>GOvtOfficialAndSalaryMap=new HashMap<String,Integer>();
		GOvtOfficialAndSalaryMap.put("IAS", 300000);
		GOvtOfficialAndSalaryMap.put("KAS", 200000);
		GOvtOfficialAndSalaryMap.put("PSI", 30000);
		GOvtOfficialAndSalaryMap.put("Income Tax", 400000);
		GOvtOfficialAndSalaryMap.put("Thahashildar", 50000);
		System.out.println(GOvtOfficialAndSalaryMap.size());
		System.out.println(GOvtOfficialAndSalaryMap.containsKey("IAS"));
		System.out.println(GOvtOfficialAndSalaryMap.containsValue(50000));
		
		Set<String>keySet = GOvtOfficialAndSalaryMap.keySet();
		Iterator <String> itr=keySet.iterator();
		while(itr.hasNext()) {
			String integer=itr.next();
			Integer ref=GOvtOfficialAndSalaryMap .get(integer);
			System.out.println(integer+" "+ref);
			
			}

		
		
		

	}
}



		
	


