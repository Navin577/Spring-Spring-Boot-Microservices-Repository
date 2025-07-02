package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service("seasonservice")
public class SeasonFinderImplClass implements ISeasonFinder {

	@Override
	public String findseason() {
		//get time
		LocalDate ld=LocalDate.now();
		//get month
		int month=ld.getMonthValue();
		//get current season
		if(month>=7 && month<=9)
			return "Rainy Season";
		else if(month>=3 && month<=6)
			return "summer";
		else
			return "Winter Season";
		
		
	}

}
