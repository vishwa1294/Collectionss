package com.xworkz.relive.rules;

public interface RelieveRule {
	int NOTICE_PERIOD_DAYS = 80;
	boolean completedBond();
	int serviceNoticePeriod();

}
