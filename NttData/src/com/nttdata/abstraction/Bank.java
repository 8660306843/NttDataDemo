package com.nttdata.abstraction;

public abstract class Bank 
{
	String bankName;
	float loanInterest;

	public Bank(String bankName, float loanInterest) 
	{
		super();
		this.bankName = bankName;
		this.loanInterest = loanInterest; 
	}
	
	void greeting()
	{
		System.out.println("Welcome to NTTDATA");
	}
	
	abstract void calculateLoanInterest();

}
