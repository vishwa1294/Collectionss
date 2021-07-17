package com.xworkz.passport;

public interface PassportRule {
	boolean detailsMatch();
	boolean indianCitizen();
	boolean criminalCase();

}
