package com.nttdata.abstraction;

public class Computer implements ElectronicDevice
{

	@Override
	public void motherboard()
	{
		System.out.println("Computer motherboard");
		
		
	}

	@Override
	public void keyboard() 
	{
		System.out.println("Computer keyboard");
	}
	
	

}
