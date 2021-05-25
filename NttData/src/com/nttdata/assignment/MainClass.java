package com.nttdata.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nttdata.java8features.Greter;

public class MainClass 
{
     public static void main(String[] args)
     {
    	
    	 //List<Employee> ll=new ArrayList<>();
    	 List<Employee> ll=new ArrayList<>();
    	 ll.add(new Employee(10 ," Deepa " ,12000.0 ," Bangalore "));
    	 ll.add(new Employee(20 ," Anu " ,35000.0 ," Mysore "));
    	 ll.add(new Employee(30 ," Vidya " ,45000.0 ," Hasan "));
    	 ll.add(new Employee(40 ," Veda " ,18000.0 ," Mangaloore "));
    	 ll.add(new Employee(50 ," Holu " ,19000.0 ," Mudhol "));
    	 ll.add(new Employee(60 ," Guru " ,28000.0 ,"  Baglakot"));
    	 

 		//filter Operation
 		ll.stream().filter((s)->s.getSal()>(20000)).forEach(s->System.out.println(s));
 		System.out.println("======================================================");
 		
 		//Map Operation
 		ll.stream().map(m->m.getAddr().toUpperCase()).forEach(System.out::println);
		System.out.println("--------------------------------------------");
 		
 		//lamda Expression
 		Comparator<Employee> nameComparator=new Comparator<Employee>()
 				{
 					public int compare(Employee e1,Employee e2)
 					{
 						return e1.getName().compareTo(e2.getName());
 					}
 				
 				};
 				Collections.sort(ll,nameComparator);
 				System.out.println("\n After sorting :");
  				System.out.println(ll);
	
     }
}