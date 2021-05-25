package com.nttdata.nestedclass;

import java.util.Scanner;

public class HRA_Calc 
{

	
class HRA
{
	public void calcualate() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the basic salary");
		int sal = sc.nextInt();
		double Hra;
	    Hra = (0.30*sal); //Assuming HRA 12% of salary
		System.out.println("Home rent allowance is :"+Hra);
	}
}
}
