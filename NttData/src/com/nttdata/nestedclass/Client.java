package com.nttdata.nestedclass;

import java.util.Scanner;

import com.nttdata.nestedclass.HRA.Employeer;

public class Client 
{
	public static void main(String[] args)
	{
		HRA hra=new HRA();
		HRA.Employeer emp=hra.new Employeer();//obj  creation inner class using outer 
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter the actual salary");
		double ac=sc.nextDouble();
		
		System.out.println("Enter the basic salary");
		double d1=sc.nextDouble();
		
		if(amountValidation(ac==d1))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
	}

	private static boolean amountValidation(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

}
