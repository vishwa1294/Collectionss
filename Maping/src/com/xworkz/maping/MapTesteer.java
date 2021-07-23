package com.xworkz.maping;
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

		
		
		

	}

}
