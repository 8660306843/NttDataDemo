package com.nttdata.arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(445);
		l.add(48);
		l.add(15);
		l.add(87);
		l.add(49);
		l.add(49);
		
		System.out.println(l);
		
		l.addFirst(85);
		System.out.println(l);
		
		l.addLast(989);
		System.out.println(l);
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
	    
		
		
		
	}

}
