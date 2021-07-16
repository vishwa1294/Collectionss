package com.xworkz.groups;

import java.util.Collections;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.groups.dto.PersonDTO;

public class PersonTester {

	public static void main(String[] args) {
		
		PersonDTO dto1=new PersonDTO("Vaishnavi",23,"vaishnavi.xworkz@gmail.com");
		PersonDTO dto2=new PersonDTO("Pavitra",22,"pavitrad.xworkz@gmail.com");
		PersonDTO dto3=new PersonDTO("Girija",24,"girija.xworkz@gmail.com");
		PersonDTO dto4=new PersonDTO("Darshan",25,"darshan.xworkz@gmail.com");
		PersonDTO dto5=new PersonDTO("Sachin",21,"sachin.xworkz@gmail.com");
		PersonDTO dto6=new PersonDTO("Sunil",26,"sunil.xworkz@gmail.com");
		
	
  List<PersonDTO> list=new ArrayList<PersonDTO>();
  
     list.add(dto1);
	list.add(dto3);
	list.add(dto2);
    list.add(dto4);
    list.add(dto6);
    list.add(dto5);
    for(PersonDTO personDTO :list) {
    	System.out.println(personDTO);
    }
    Collections.sort(list);
    for(PersonDTO personDTO:list) {
    	System.out.println(personDTO);
    }

}
}

