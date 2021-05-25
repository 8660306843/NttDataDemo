package com.nttdata.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<Integer>();
		l.add(45);
		l.add(78);
		l.add(85);
		l.add(12);
		l.add(15);
		
		for(int i=0;i<l.size();i++)
		{
			Integer itr=l.get(i);
			
			if(itr % 2==0)
			{
				System.out.println(itr);
			}
		}
		
	}

}
