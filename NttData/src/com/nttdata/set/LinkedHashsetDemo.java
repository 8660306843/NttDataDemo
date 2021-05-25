package com.nttdata.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo
{
	public static void main(String[] args)
	{
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(78);
		s.add(63);
		s.add(96);
		s.add(123);
		s.add(123);
		System.out.println(s);
		
	}

}
