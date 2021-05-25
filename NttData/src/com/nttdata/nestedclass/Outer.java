package com.nttdata.nestedclass;

public class Outer
{
	int a;
	void print()
	{
		class inner
		{
			void foo()
			{
				System.out.println(" Local method inner class");
			}
		}
		inner in =new inner();
		in.foo();
		
	}
	
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		out.print();
		
	}

}
