package com.nttdata.java8features;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation 
{
	public static void main(String[] args)
	{
		List<String> member=new ArrayList<>();
		member.add("Anu");
		member.add("Deepa");
		member.add("Vidya");
		member.add("Veeda");
		member.add("Holu");
		member.add("Sangi");
		member.add("Sangu");
		member.add("Manu");
		member.add("Guru");
		
		//filter Operation
		member.stream().filter((s)->s.startsWith("S")).forEach(s->System.out.println(s));
		System.out.println("=======================================");
		
		//Map Operation
		member.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//reduced Operation
		String res=member.stream().reduce("",(a,b)->a+b);
		System.out.println("====================================");
		System.out.println(res);
		
		
		
		
	}

}
