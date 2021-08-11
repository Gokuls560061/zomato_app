package com.example.restservice;


public class RentCalculator implements ICalculator {
	
	 int rent;
	 int months;

	
	 public RentCalculator(int rent, int months) {
			super();
			this.rent = rent;
			this.months = months;
		}




	public int getRent() {
		return rent;
	}




	public void setRent(int rent) {
		this.rent = rent;
	}




	public int getMonths() {
		return months;
	}




	public void setMonths(int months) {
		this.months = months;
	}




	@Override
	public int calculate() {
		return this.rent * this.months;
	}

}

