package com.MethodExercise.demo;

import java.util.Scanner;

public class ExpethionHandling {
/*
 * two types of exceptions in java
 * Checked Exception
 * Unchecked Exception
 * 
 */
	public static void main (String [] args)
	{
	Tryit();
	}
	public static void Tryit()
	
	{
		int a;
		int b;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		
		sc.close();
		
		try {
			
		int c=a/b;
		
			System.out.println(c);
			
		}
		catch (ArithmeticException e) 
		{
			
			System.out.println("Number can't be devided by zero");
	}
	}
}
	
	

