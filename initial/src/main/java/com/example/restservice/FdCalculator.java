package com.example.restservice;

public class FdCalculator implements ICalculator {
	
	public int depositAmount;
	public int rateOfInterest;
	public int numberOfYears;

	
	
	public FdCalculator(int depositAmount, int rateOfInterest, int numberOfYears) {
		super();
		this.depositAmount = depositAmount;
		this.rateOfInterest = rateOfInterest;
		this.numberOfYears = numberOfYears;
	}



	public int getDepositAmount() {
		return depositAmount;
	}



	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}



	public int getRateOfInterest() {
		return rateOfInterest;
	}



	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}



	public int getNumberOfYears() {
		return numberOfYears;
	}



	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}



	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return(this.depositAmount + (this.depositAmount * this.rateOfInterest * this.numberOfYears)/100);
	}

}