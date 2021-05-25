package com.nttdata.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList 
{
	public static void main(String[] args)
	{
		/*ArrayList<String> al=new ArrayList<String>();
		System.out.println("Before element " +al.size());
		al.add("Hello");
		al.add("guys");
		al.add("good morning");
		al.add("how is ");
		al.add("java traning");
		al.add("good morning");
		al.add("how is ");
		al.add("java traning");
		
		System.out.println("After element length:" +al.size());
		
		System.out.println(al);
		Collections.sort(al);
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		 
		ArrayList<Custmore> list=new ArrayList<>();
		list.add(new Custmore(101, "Deepa", "bng"));
		list.add(new Custmore(12, "vidya", "bwd"));
		list.add(new Custmore(145, "guru", "ing"));
		list.add(new Custmore(123, "holu", "blg"));
		list.add(new Custmore(125, "veda", "mysore"));
		
		//Collections.sort((List<T>) list);
		
		System.out.println("Forword direction");
		ListIterator<Custmore> ltr=list.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Backword direction");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}

}
