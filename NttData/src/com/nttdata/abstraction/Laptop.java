package com.nttdata.abstraction;

public class Laptop implements ElectronicDevice
{

	@Override
	public void motherboard()
	{
		System.out.println("Laptop motherboard");
		
	}

	@Override
	public void keyboard() 
	{
		System.out.println("Laptop keyboard");
		
	}
	

}
