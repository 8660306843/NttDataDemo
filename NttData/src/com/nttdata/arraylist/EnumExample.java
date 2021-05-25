package com.nttdata.arraylist;

public class EnumExample
{
	public enum Session{WINTER,SUMMER,SPRING}
	public static void main(String[] args) 
	{
		
		for(Session s:Session.values())
		{
			System.out.println(s);
		}
		
		
	}

}
