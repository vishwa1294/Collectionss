package com.xworkz.maping;
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
		
		
	}

}
