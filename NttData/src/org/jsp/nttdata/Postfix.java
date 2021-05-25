package org.jsp.nttdata;

public class Postfix 
{
	public static void main(String[] args)
	{
		int i=10;
		int n=i++%5;
		System.out.println(n);//0
		
		int j=8;
		j<<=2;
		System.out.println(j);//2
		
		int k=17;
		k>>=1;
		System.out.println(k);//8
		
		int m=10;
		//m--%5>0;
		
	}

}
