package org.jsp.nttdata;

public class ShiftOperator
{
	public static void main(String[] args) 
	{
		//Left Shifting a value 2times
		int a=5;
		System.out.println("Original a:"+Integer.toBinaryString(a));  
		int shiftleft1=a<<1;
		System.out.println("Shiftleft1a:"+Integer.toBinaryString(shiftleft1)); 
		int shiftleft2=shiftleft1<<1; 
		System.out.println("Shiftleft2b:"+Integer.toBinaryString(shiftleft2));
		
		//Right Shifting a + ve value 2times  
		int r=5;
		System.out.println("Original r:"+Integer.toBinaryString(r));
		int shiftright1=r>>1;
		System.out.println("Shiftright1 r:"+Integer.toBinaryString(shiftright1)); 
		int shiftright2=shiftright1>>1;
		System.out.println("Shiftright2r:"+Integer.toBinaryString(shiftright2));
	
		//Right Shifting a - ve value 2 times 
		int rn=-5; 
		System.out.println("Original r:"+Integer.toBinaryString(rn));
		int shiftrightn1=rn>>1;
		System.out.println("Shiftrightn1 r:"+Integer.toBinaryString(shiftrightn1)); 
		int shiftrightn2=shiftrightn1>>1;
		System.out.println("Shiftrightn2 r:"+Integer.toBinaryString(shiftrightn2));
		
		
		//Positive Right Shifting a - ve value 2 times
		int rzf=-5;
		System.out.println("Original r:"+Integer.toBinaryString(rzf)); 
		int shiftrightzf1=rzf>>>1; 
		System.out.println("Shiftrightzf1 r:"+Integer.toBinaryString(shiftrightzf1));
		int shiftrightzf2=shiftrightzf1>>>1; 
		System.out.println("Shiftrightzf2 r:"+Integer.toBinaryString(shiftrightzf2));
		
	}

}
