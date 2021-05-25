package com.nttdata.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> t=new TreeSet<Integer>();
		t.add(12);
		t.add(15);
		t.add(78);
		t.add(85);
		t.add(123);
		
		System.out.println(t);
		
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(123));
		t.add(43);
		t.add(65);
		System.out.println(t);
		
		
	}

}
