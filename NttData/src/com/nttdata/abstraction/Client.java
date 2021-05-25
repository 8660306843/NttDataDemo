package com.nttdata.abstraction;

public class Client
{
public static void main(String[] args) {
		
		Bank customer = new Customer("SBI",2.3f,224830,"Deepa",20000f);//up casting in java
		//customer.logincredentials();
		customer.greeting();
		customer.calculateLoanInterest();
		
		//down casting in java
		
		Customer cut= (Customer)customer;
		cut.loginCredentials();
		
		
	}

}
