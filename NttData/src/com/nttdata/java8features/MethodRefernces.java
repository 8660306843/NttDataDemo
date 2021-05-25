package com.nttdata.java8features;

public class MethodRefernces 
{
	static void foo()
	{
		System.out.println("Static foo");
	}
	
	public static void main(String[] args) 
	{
		//Method mm=MethodRefernces::foo;
		
		MethodRefernces m=new MethodRefernces();
		//Method mm=m::foo;
		
	}

}
