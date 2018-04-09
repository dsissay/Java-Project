package com.MethodExercise.demo;

public class MethodExa
{
	
	public static void main (String [] args)
	{
		myMethod();
		int result;
		int n;
		n=3;
		result=square(n);
		System.out.println(result);
		
		n=4;
		result=square(n);
		System.out.println(result);
	}
	private static void myMethod()
	
	{
		
		System.out.println("this is my java example method");
	}
	
	public static int square(int i) {
		return i*i;
	}

}
