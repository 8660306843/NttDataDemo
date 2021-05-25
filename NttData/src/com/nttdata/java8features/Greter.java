package com.nttdata.java8features;

public interface Greter
{
	void greeting();
	
	default void print()
	{
		System.out.println("Default inteface function");
	}
	
	static void foo()
	{
		System.out.println("Static interface");
	}
}
