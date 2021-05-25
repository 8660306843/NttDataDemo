package com.nttdata.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass
{
	public static void main(String[] args)
	{
		//Traditional 
		Greet greet=new Greet();
		greet.greeting();
		greet.print();//Default method in functional interface
		
		//Lamda Expression
		Greter gtr=()->{
			System.out.println("Hello welcome to java features");
			
		};
		gtr.greeting();
		
		Greter gtr1=()->{
			System.out.println("Hi new implementation");
		};
		gtr1.greeting();
		
		Greter.foo();//Static method direct invoked by interface name in functional Interface
		
		//Lamda exp parameters
		/*Addition add=(a,b)->{
			return (a+b);
		};
		int res=add.add(10, 20);
		System.out.println("Addtion of two numbers"+res);*/
		
		//pre-defined functional interface called predicated
		Predicate<Integer> p=num->(num>10);
		boolean b=p.test(20);
		System.out.println(b);
		
		Predicate<String> ps=s->(s.length()>9);
		System.out.println(ps.test("HOLABASU"));
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("DEEPA"));
		
		
		
		
		
		
		
	}

}
