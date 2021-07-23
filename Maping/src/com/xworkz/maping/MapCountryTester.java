package com.xworkz.maping;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapCountryTester {

	public static void main(String[] args) {
		
		Map<String,Integer>countrynameAndPopulationMap=new HashMap<String,Integer>();
		countrynameAndPopulationMap.put("India",13000);
		countrynameAndPopulationMap.put("Singapur",5700000);
		countrynameAndPopulationMap.put("America",3280000);
		countrynameAndPopulationMap.put("China",1390000000);
		System.out.println(countrynameAndPopulationMap.size());
		System.out.println(countrynameAndPopulationMap.containsKey("America"));
		System.out.println(countrynameAndPopulationMap.containsValue(1390000000));
		
		Set<String>keySet = countrynameAndPopulationMap.keySet();
		Iterator <String> itr=keySet.iterator();
		while(itr.hasNext()) {
			String integer=itr.next();
			Integer ref=countrynameAndPopulationMap .get(integer);
			System.out.println(integer+" "+ref);
			
			}
		Collection<Integer> values =countrynameAndPopulationMap.values();

		System.out.println("Population");
		Iterator<Integer> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Integer str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("***");
		System.out.println("Country name printing");
		Iterator<String> itrvalue = keySet.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("***");
		System.out.println("country name&population printing");
		Iterator<String> itr1 = keySet.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			Integer ref2 = countrynameAndPopulationMap.get(temp);
			System.out.println(temp+ " " + ref2);
		}
		System.out.println("XXXX");
		countrynameAndPopulationMap.remove("Singapur",5700000);
		System.out.println(countrynameAndPopulationMap.size());
	}

}
		
		
	
