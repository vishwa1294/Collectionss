package com.xworkz.passport.externalaffairs.citizen;

import com.xworkz.passport.PassportRule;



public class Citizen implements PassportRule {
	private String name;
		private long mobileNo;
@Override
public boolean detailsMatch() {
System.out.println("this.name+details match");
return true;
		
}

@Override
public boolean indianCitizen() {
System.out.println("this.name+indian citizen");
return true;
		
}
@Override
public boolean criminalCase(){
System.out.println("this.name+criminal case();");
return true;
		
}
}