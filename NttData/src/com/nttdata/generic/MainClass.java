package com.nttdata.generic;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
	public static void drawshape(List<? extends Shape> list)
	{
		for(Shape s:list)
		{
			s.draw();
		}
		
	}
	
	public static void main(String[] args)
	{
		List<Rectangle> lr=new ArrayList<Rectangle>();
		lr.add(new Rectangle());
		
		List<Circle> cl=new ArrayList<Circle>();
		cl.add(new Circle());
		cl.add(new Circle());
		
		drawshape(cl);
		drawshape(lr);
		
	}

}
