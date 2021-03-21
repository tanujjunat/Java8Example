package com.surtan.practice;

public class City {
	
	String maleCount;
	String femaleCount;
	String perCapitaIncome;
	
	public City(String maleCount, String femaleCount, String perCapitaIncome) {
		super();
		this.maleCount = maleCount;
		this.femaleCount = femaleCount;
		this.perCapitaIncome = perCapitaIncome;
	}

	@Override
	public String toString() {
		return "City [maleCount=" + maleCount + ", femaleCount=" + femaleCount + ", perCapitaIncome=" + perCapitaIncome
				+ "]";
	}

	
	
}
