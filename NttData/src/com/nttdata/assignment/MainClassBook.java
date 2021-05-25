package com.nttdata.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClassBook
{
	public static void main(String[] args)
	{
		Set<Book1> hs=new HashSet<>();
		hs.add(new Book1(10, "JAVA", "PADMABUSHAN", 500.52, "Excellent", 200));
		hs.add(new Book1(20, "HTML", "Imthiyaz", 695.52, "Good", 200));
		hs.add(new Book1(30, "CSS", "Raksgit", 984.52, "nice", 200));
		hs.add(new Book1(40, "JS", "priya", 452.52, "NNN", 200));
		hs.add(new Book1(500, "WEB", "vidya", 987.52, "MAUN", 200));
		
		System.out.println("Original Book :"+hs);
		
		
		// Before Sorting
        System.out.println("Before Sorting :"
                + " HashSet contents in random order\n");
        for(Book1 s : hs) {
            System.out.println(s);
        }
 
        // create ArrayList and store HashSet contents 
        List<Book1> al = new ArrayList<Book1>(hs);
 
        // sort using Collections.sort(); method
        //Collections.sort(alCoaches);
      // Collections.sort(al);
        Set<Book1> al1 = new TreeSet<Book1>(hs);
 
 
        // After Sorting
        System.out.println("\n\nAfter Sorting : Sorted order\n");
        for(Book1 s : al1) {
            System.out.println(s);
		
		
		
		
	}

}
}
