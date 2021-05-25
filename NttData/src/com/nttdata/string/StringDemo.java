package com.nttdata.string;

public class StringDemo 
{
	public static void main(String[] args) {
		
		
		String s="Hello";//litteral
		String s2="Hello";
		String s1=new String("Hello");//new 
		

		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		String s3=s+s1;
		System.out.println(s3.hashCode());
		
		System.out.println(System.identityHashCode(s3));
		
		
		StringBuffer str=new StringBuffer();
		StringBuffer str1=new StringBuffer();
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println(str.append(str1).hashCode());
	}

}
