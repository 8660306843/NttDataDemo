package com.nttdata.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample
{
	public static void main(String[] args) 
	{
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(101, "Chocalate", 25));
		list.add(new Product(105, "Darling", 85));
		list.add(new Product(103, "Silk", 105));
		list.add(new Product(108, "emali", 48));
		list.add(new Product(143, "fruit", 99));
		
		System.out.println("Sorting by name");
		
		Collections.sort(list,new SortByName());
		
		
		for(Product p:list)
		{
			System.out.println(p);
		}
		
	}

}
