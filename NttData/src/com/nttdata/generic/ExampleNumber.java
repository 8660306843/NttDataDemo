package com.nttdata.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleNumber
{
		public static void addnumber(List<? super Integer>list)
		{
			for(Object o:list)
			{
				System.out.println(o);
			}
		}
		public static void main(String[] args) 
		{
			List<Integer> al=Arrays.asList(1,2,3,4,5,6);
			System.out.println("Values are list Integer");
			
			addnumber(al);
			
			List<Integer> al1=Arrays.asList(8,9,9,7,40);
			System.out.println("Values are Number");
			
			addnumber(al1);
			
			
		}

}
