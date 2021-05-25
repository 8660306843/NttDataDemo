package com.nttdata.string;

public class ObjectClass 
{
	String name;
	protected void finalize() throws Throwable 
	{
		System.out.println(" invoked ");
	
	}
	public static void main(String[] args) {

	Integer a=new Integer (30);
	Integer b=new Integer (30);

	System.out.println(a.hashCode()+""+b.hashCode()); 
	System.out.println(a.equals(b));

	ObjectClass obj=new ObjectClass();
	ObjectClass obj1=new ObjectClass();

	obj.name="Deepa";

	obj=null;
	obj1=null;

	System.gc();

}
}
