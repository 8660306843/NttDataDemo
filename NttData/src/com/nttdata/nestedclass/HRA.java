package com.nttdata.nestedclass;

public class HRA
{
	private double actualrent;
	private double basicsalry;
	
	class Employeer
	{
		private String name;
		private double salary;
		
		
		boolean amountValidation()
		{
			
			if(actualrent==basicsalry)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	
	

}
