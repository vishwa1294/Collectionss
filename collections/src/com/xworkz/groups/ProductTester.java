package com.xworkz.groups;

import com.xworkz.groups.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductTester {

	public static void main(String[] args) {
		
		ProductDTO dto1=new ProductDTO("Car","Mercedes-Benz",62,true);
		ProductDTO dto2=new ProductDTO("Shampoo","Pantene",150,true);
		ProductDTO dto3=new ProductDTO("BodyLotion","Dove",1000,true);
		ProductDTO dto5=new ProductDTO("HairOil","Ashwini",200,false);
		ProductDTO dto4=new ProductDTO("LipStick","Lakme",1500,false);
		
		
		 List<ProductDTO> list=new ArrayList<ProductDTO>();
		  
	     list.add(dto1);
		list.add(dto2);
		list.add(dto3);
	    list.add(dto5);
	    list.add(dto4);
	    
	    for(ProductDTO productDTO :list) {
	    	System.out.println(productDTO);
	    }
	    
	    Collections.sort(list);
	    for(ProductDTO product :list) {
	    	System.out.println(product);
	    }
		
	}
	

}
	
	
