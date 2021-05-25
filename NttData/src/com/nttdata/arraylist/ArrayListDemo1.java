package com.nttdata.arraylist;

import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

public class ArrayListDemo1 
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<Integer>();
		System.out.println("Before adding: "+l.size());
		l.add(45);
		l.add(48);
		l.add(87);
		l.add(87);
		l.add(12);
		l.add(20);
		System.out.println("After adding :"+l.size());
		
		System.out.println(l);
		
		System.out.println(l instanceof List);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof RandomAccessFile);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Collections);
		System.out.println(l instanceof Set);
		
	}

}
