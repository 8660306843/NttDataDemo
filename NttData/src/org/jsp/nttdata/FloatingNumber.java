package org.jsp.nttdata;

import java.util.Scanner;

public class FloatingNumber {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number: ");
	float num = sc.nextFloat();
	if(num != 0.0f) 
		System.out.println("Number is not zero : "+num);
		else
		System.out.println("Number is equal to zero : "+num);	
	}

}

