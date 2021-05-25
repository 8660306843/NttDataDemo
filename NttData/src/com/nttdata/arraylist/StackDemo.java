package com.nttdata.arraylist;

import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(78);
		s.push(78);
		s.push(65);
		s.push(25);
		s.push(214);
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.search(25));
		System.out.println(s.pop());
		System.out.println(s);
		s.push(987);
		System.out.println(s.peek());
		System.out.println(s.peek());
	}

}
