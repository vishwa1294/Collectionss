package com.xworkz.maping;
import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTesteer {

	public static void main(String[] args) {
		Map<Integer, Integer>AadharnoAndMobilenoMap =new HashMap<Integer, Integer>();
		AadharnoAndMobilenoMap.put(538652971, 963280233);
		AadharnoAndMobilenoMap.put(567849324,944886450);
		AadharnoAndMobilenoMap.put(564737373, 894636772);
		AadharnoAndMobilenoMap.put(7372882, 938373624);
		AadharnoAndMobilenoMap.put(56473773,736626262);
		AadharnoAndMobilenoMap.put(674738383, 78732233);
		System.out.println(AadharnoAndMobilenoMap.size());
		System.out.println(AadharnoAndMobilenoMap.containsKey(944886450));
		System.out.println(AadharnoAndMobilenoMap.containsValue(674738383));
		
		Set<Integer>keySet = AadharnoAndMobilenoMap.keySet();
		Iterator <Integer> itr=keySet.iterator();
		while(itr.hasNext()) {
			Integer integer=itr.next();
			Integer ref= AadharnoAndMobilenoMap.get(integer);
			System.out.println(integer+" "+ref);
			
			}
		Collection<Integer> values =AadharnoAndMobilenoMap.values();

		System.out.println("Mobile NUmber");
		Iterator<Integer> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Integer str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("***");
		System.out.println("Aadhar no printing");
		Iterator<Integer> itrvalue = keySet.iterator();
		while (itrvalue.hasNext()) {
			Integer stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("***");
		System.out.println("Aadhar &Mobile no printing");
		Iterator<Integer> itr1 = keySet.iterator();
		while (itr.hasNext()) {
			Integer temp = itr.next();
			Integer ref2 = AadharnoAndMobilenoMap.get(temp);
			System.out.println(temp+ " " + ref2);
		}
		System.out.println("XXXX");
		AadharnoAndMobilenoMap.remove(963280233);
		System.out.println(AadharnoAndMobilenoMap.size());
	}

}
	

		
		
		

	


