package com.nttdata.objectoriented;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1
{
	//private FileOutputStream fout;

	void readFromfile()
	{
		try 
		{
			FileInputStream fin=new FileInputStream("abc.txt");
			BufferedInputStream bfin=new BufferedInputStream(fin);
			int i=0;
			while((i=fin.read()) != 1)
			{
				System.out.println((char)i);
			}
			//int c=fin.read();
			//System.out.println(c);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void writeTofile()
	{
		FileOutputStream fout=null;
			BufferedOutputStream bfout=null;
		String s="hello welcome to java files";
		byte []b=s.getBytes();
		try
		{
			 fout=new FileOutputStream("abc.txt");
			 bfout=new BufferedOutputStream(bfout);
			fout.write(b);
			System.out.println("Written Successfully");
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.writeTofile();
		//d1.readFromfile();
		
	}

}
