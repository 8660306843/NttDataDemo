package com.nttdata.encapsulation;

public class MainClass
{
	public static void main(String[] args) {
		
		
		EncapsulationExample en=new EncapsulationExample();
		
		
		Student std=new Student(101, "Deepa", 69.12);
		System.out.println(std);
		
		
		std.setId(108);
		System.out.println(std);
	}

}
