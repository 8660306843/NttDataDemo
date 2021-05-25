package com.nttdata.polymorphism;

public class Area 
{
	 Area(int breath,int height)
	{
		System.out.println(breath*height);
	}
	 Area(int breath,double width)
	 {
		 System.out.println(breath*width*width);
	 }

}
