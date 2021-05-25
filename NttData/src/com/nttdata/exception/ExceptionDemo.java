package com.nttdata.exception;

public class ExceptionDemo
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10/2;
			System.out.println(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
	}
	

}
