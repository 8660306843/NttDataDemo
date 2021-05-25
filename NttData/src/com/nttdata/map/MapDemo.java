package com.nttdata.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(10, "Hello");
		m.put(20, "Hi");
		m.put(30, "Bye");
		m.put(40, "me");
		System.out.println(m);
		
		System.out.println(m.get(20));
		System.out.println(m.containsKey(40));
		System.out.println(m.containsValue("me"));
		m.remove(30);
		System.out.println(m);
		
		Set<Integer> keys=m.keySet();
		System.out.println("keys :"  +keys);
		
		
		
		
	}

}
