package com.example.restservice;

public class LoanEmiCalculator implements ICalculator {

	public int loanAmount;
	 public int timeInMonths;
	 public int rateOfInterest;



	public LoanEmiCalculator(int loanAmount, int timeInMonths, int rateOfInterest) {
		super();
		this.loanAmount = loanAmount;
		this.timeInMonths = timeInMonths;
		this.rateOfInterest = rateOfInterest;
	}



	public int getLoanAmount() {
		return loanAmount;
	}



	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}



	public int getTimeInMonths() {
		return timeInMonths;
	}



	public void setTimeInMonths(int timeInMonths) {
		this.timeInMonths = timeInMonths;
	}



	public int getRateOfInterest() {
		return rateOfInterest;
	}



	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}



	@Override
	public int calculate() {
		return (this.loanAmount + this.calculateInterest())/this.timeInMonths;
	}

	public int calculateInterest() {
		return (this.loanAmount * this.timeInMonths * this.rateOfInterest)/(100*12);
	}

}
