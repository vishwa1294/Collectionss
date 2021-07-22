package com.xworkz.transformer;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerServiceImpl;
import com.xworkz.transformer.service.TransformerService;

public class TransformerTester {

	

	public static void main(String[] args) {

	
	

		TransformerDTO ref = new TransformerDTO("Vaishnavi","Jamkhandi","Silent","Sometime","Always happy","Depends on mood","Singing");
		TransformerService service = new TransformerServiceImpl();
		String save = service.validatedAndSave(ref);
		System.out.println(save);

		System.out.println(" ");

		TransformerDTO ref1 = new TransformerDTO("Pavitra", "Bijapur", "Very silent", "Sometime", "Depends on Mood","Mood ","sleepy");
		String save1 = service.validatedAndSave(ref1);
		System.out.println(save1);
}
}