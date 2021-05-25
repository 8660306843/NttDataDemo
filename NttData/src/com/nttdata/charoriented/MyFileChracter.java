package com.nttdata.charoriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileChracter 
{
	void WritrToFile()
	{
		try 
		{
			FileWriter fr=new FileWriter("test.txt");
			fr.write("Welcome java");
			//System.out.println(fr);
			System.out.println("Sucess!!!!");
			fr.close();
		}
		
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void ReadFromFile()
	{
		try
		{
			FileReader frd=new FileReader("test.txt");
			int i;
			//while((i=frd.read())=!-1)
			{
				//System.out.print((char)i);
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args)
	{
		MyFileChracter file=new MyFileChracter();
		file.WritrToFile();
		file.ReadFromFile();
		
	}

}
