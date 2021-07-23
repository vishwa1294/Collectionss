package com.xworkz.maping;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapOfficalTester {

	public static void main(String[] args) {
		Map<String,Integer>GOvtOfficialAndSalaryMap=new HashMap<String,Integer>();
		GOvtOfficialAndSalaryMap.put("IAS officier", 300000);
		GOvtOfficialAndSalaryMap.put("KAS officier", 200000);
		GOvtOfficialAndSalaryMap.put("PSI officier", 30000);
		GOvtOfficialAndSalaryMap.put("Income Tax officier", 400000);
		GOvtOfficialAndSalaryMap.put("Thahashildar officier", 50000);
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
		Collection<Integer> values =GOvtOfficialAndSalaryMap.values();

		System.out.println("Salary");
		Iterator<Integer> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Integer str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("***");
		System.out.println("GovtOfficical printing");
		Iterator<String> itrvalue = keySet.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("***");
		System.out.println("GovtOfficical &salary no printing");
		Iterator<String> itr1 = keySet.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			Integer ref2 = GOvtOfficialAndSalaryMap.get(temp);
			System.out.println(temp+ " " + ref2);
		}
		System.out.println("XXXX");
		GOvtOfficialAndSalaryMap.remove("Income Tax officer", 400000);
		System.out.println(GOvtOfficialAndSalaryMap.size());
	}

}
	


		
		
		

	



		
	


