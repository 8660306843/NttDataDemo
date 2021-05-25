package com.nttdata.string;

public class ArrayDemo 
{
	public static void main(String[] args) {
		
		Integer a[][]= {{1,2,3},{4,5,6},{7,6,8}};//wrap class value pre type int in an obj
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
