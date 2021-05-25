package com.nttdata.objectoriented;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(101, "Deepa");
		
		//Serialization
		
		try 
		{
			FileOutputStream fout=new FileOutputStream("serialize.txt");
			ObjectOutputStream od=new ObjectOutputStream(fout);
			
			od.writeObject(emp);
			System.out.println("Done Serilization");
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
		
		//deSerilization
		
		
		try 
		{
			FileInputStream fin=new FileInputStream("serialize.txt");
			ObjectInputStream oi=new ObjectInputStream(fin);
			Employee e=(Employee)oi.readObject();//Dc
			System.out.println(e);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
