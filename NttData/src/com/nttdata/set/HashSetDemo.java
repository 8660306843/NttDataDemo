package com.nttdata.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<Integer> st=new HashSet<Integer>();
		st.add(12);
		st.add(87);
		st.add(98);
		st.add(98);
		st.add(null);
		System.out.println(st);
		
		System.out.println(st.add(108));
		
		System.out.println("Before sorting "+st);
		
		List<Integer> al=new ArrayList<Integer>(st);

		System.out.println("After sorting :"+st);
		
		
		
		
	}

}
