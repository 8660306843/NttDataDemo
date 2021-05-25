package com.nttdata.string;

import java.text.NumberFormat;
import java.util.Locale;

public class StringExample 
{
	public static void main(String[] args) {
		
		String s="hello";
		String s1="hello";
		
		Double d=new Double(32145.726);
		
		Locale locale=Locale.CANADA;
		
		NumberFormat n=NumberFormat.getInstance();
		
		String ss=n.format(d);
		System.out.println(ss);
		
		System.out.println(locale);
		System.out.println(s1.substring(1,3));
		System.out.println(s.hashCode()+ "  "+s1.hashCode());
		
	}

}
