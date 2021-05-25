package com.nttdata.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMainClass
{
	public static void main(String[] args) 
	{
		List<Book> l = new ArrayList<Book>();
		
		l.add(new Book(1234,"Java",584.85,"Padmabushan"));
		l.add(new Book(8521,"Maths",12.85,"Vidya"));
		l.add(new Book(9874,"Bio",58.85,"Uday"));
		l.add(new Book(8745,"Phy",965.85,"Padma"));
		l.add(new Book(1111,"HTML",1000.85,"Imtiyaz"));
		
		Collections.sort(l,new Book());
		
		System.out.println("ISBN_no\t\tname\t\tprice\t\tAuthorName");
		System.out.println("------------------------------------------------------");
		for(int i=0;i<l.size();i++)
		{
			Object obj=l.get(i);
			if(obj instanceof Book)
			{
				System.out.println(obj);
			}
		}
		
	}

}
