package org.jsp.nttdata;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
	
public class SearchElement1
{

		public static void main(String[] args)
		{
			Integer arr[]= {1,2,3,4,5,6,7,8,9};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Search Element in Array");
			Integer value=sc.nextInt();
			//Integer value =11;
			
			boolean test = Arrays.asList(arr).contains(value);
			//System.out.println(Arrays.asList(arr));
			//System.out.println(value);
			if(test) {
			System.out.println("value found in array : " +value);
			}
			else 
			{
			System.out.println("value not found in array: " +value);
			}
			
		}
		    
		}


