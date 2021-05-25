package com.nttdata.objectoriented;

import java.io.Serializable;

public class Employee implements Serializable
{
	//private static final long se
	private transient int a;//remove the var
	private String name;
	 
	public Employee(int a, String name)
	{
		super();
		this.a = a;
		this.name = name;
	}

	public int getA()
	{
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [a=" + a + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
