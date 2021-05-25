package org.jsp.nttdata;

import java.util.Scanner;

public class FrenchFranc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number in French Francs ");
		double frans = sc.nextDouble();
		double usdoller = frans*6.85062;
		System.out.println("French Francs : " +frans + " is Equivalent to "+ "US Doller is : " +usdoller);
	}

}
