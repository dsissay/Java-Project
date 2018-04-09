package com.MethodExercise.demo;

import java.util.Scanner;

public class ArithemeticMain {
	
	public static void main (String[] args)
	{
		int a;
		int b;
		int sum;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("please Enter first Number");
		a=sc.nextInt();
		System.out.println("please Enter Seconed Number");
		b=sc.nextInt();
		sc.close();
		
		 sum=getIntegerSum(a,b);
		 System.out.println("The Sum is:"+sum);
		 sum=multiplyInteger(a,b);
		 System.out.println("The Multiply is:"+sum);
	}

	public static int getIntegerSum(int x, int y) {
		return x+y;
	}
	
	public static int multiplyInteger(int h, int g)
	{
		return h*g;
	}

}
