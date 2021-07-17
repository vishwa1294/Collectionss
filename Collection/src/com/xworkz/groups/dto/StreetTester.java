package com.xworkz.groups.dto;

import com.xworkz.groups.dto.StreetDTO;
import java.util.List;
import java.util.ArrayList;

public class StreetTester{
	public static void main(String[] args) {
		
	
StreetDTO streetDTO=new StreetDTO();
streetDTO.setName("Avenue");

streetDTO.setPincode(56002);
streetDTO.setLandMark("OrionMall");
streetDTO.setCity("K.P Market");
	
System.out.println(streetDTO);

StreetDTO	streetDTO2=new StreetDTO("ShivajiNagar",67889,"MantriMall","M.G Market");
System.out.println(streetDTO2);
	
List<String>streetList=new ArrayList<String>();
streetList.add("Avenue");
streetList.add("ShivajiNagar");

	
streetList.add("Residency Road");
streetList.add("Majestic Market");
	//add(i.e)
streetList.add(0,"ChickpetMarket");
	System.out.println(streetList.get(0));
	

streetList .addAll(streetList);
System.out.println(streetList.size());
	



	//remove(i,e)
for(int i=0; i<streetList.size();i++) {
	System.out.println(streetList.get(i));
	if("ShivajiNagar".equals(streetList.get(i))){
		streetList.remove(i);
	}
	System.out.println(streetList.get(i));

	
	
	}
	
boolean containAll=streetList.contains("Avenu");
System.out.println("ContainsAll");


boolean removed=streetList.remove("Majestic Market");
System.out.println(removed);

}
}
