package org.jsp.nttdata;
public class GreaterArray
{
 public static void main(String[] args)
 {
	int[] arr = {10,35,45,65,78,90,2,5,6,7};
   	int x = 0;
          
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] >= 10) {
            x++;
          }          
        }                                 
          System.out.println(x);
    
 }
 }
 