package com.nttdata.abstraction;

public class Customer extends Bank
{
	int customerId;
	String customerName;
	float balance;

	public Customer(String bankName,float loanInterest,int customerId,String customerName,float balance) 
	{
		super(bankName,loanInterest);
		this.balance = balance;
		this.customerId = customerId;
		this.customerName = customerName;
		
		
	}
	
	void calculateLoanInterest()
	{
		System.out.println("loan interest is "+ balance*loanInterest/20);
	}
	
	void loginCredentials()
	{
		System.out.println("Enter the login details here");
	}

}
