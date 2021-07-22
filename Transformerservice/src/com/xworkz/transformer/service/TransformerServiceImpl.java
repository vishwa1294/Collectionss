package com.xworkz.transformer.service;

import com.xworkz.transformer.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {

	private boolean sadValidate;
	private boolean angryValidate;
	private boolean happyValidate;

	@Override
	public String validatedAndSave(TransformerDTO dto) {
		boolean namevalidate = false;
		boolean placevalidate=false;
		boolean angry=false;
		boolean happy=false;
		boolean sad=false;
		

		if (dto != null) {
			System.out.println("DTO is not null , will start validation");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 50) {
				System.out.println("Name is valid");
				namevalidate = true;
			} else {
				System.out.println("Name is notvalid");
				namevalidate = false;
			}

			String place = dto.getPlace();
			if (place != null && !place.isEmpty() && place.length() >= 4 && place.length() <= 20) {
				System.out.println("Place is valid");
				placevalidate = true;
			} else {
				System.out.println("Place is Notvalid");
				placevalidate = false;
			}

			String angry1 = dto.getAngry();
			if (angry1 != null && !angry1.isEmpty() && angry1.length() >= 4 && angry1.length() <= 12) {
				System.out.println("Angry is valid");
				angryValidate = true;
			} else {
				System.out.println("Angry is not valid");
				angryValidate = false;
			}

			String happy1 = dto.getHappy();
			if (happy1 != null && !happy1.isEmpty() && happy1.length() >= 4 && happy1.length() <= 12) {
				System.out.println("Happy is valid");
				happyValidate = true;
			} else {
				System.out.println("Happy is not valid");
				happyValidate = false;
			}

			String sad1 = dto.getSad();
			if (sad1 != null && !sad1.isEmpty() && sad1.length() >= 4 && sad1.length() <= 12) {
				System.out.println("Sad is valid");
				sadValidate = true;
			} else {
				System.out.println("Sad is not valid");
				sadValidate = false;
			}
			if (namevalidate && placevalidate && angryValidate && happyValidate && sadValidate) {
				System.out.println("data is valid ");
				return "SUCCESS";
			}

			return "FAILURE";

		}
		return "FAILURE";
	}
}