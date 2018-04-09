package com.MyOwnExercise.demo;

import java.util.Scanner;

public class ArrayObjects {
	
	public static void main (String [] args)
	{
		String fname;
			String lname;
	
			Scanner sc=new Scanner (System.in);
			System.out.println("Please Enter the First name");
			fname=sc.nextLine();
			
			
			System.out.println("Please Enter the Second name");
			lname=sc.nextLine();
			System.out.println("Your full Name Is"+" "+ fname + " "+ lname);
			//sc.close();

	int a;
	int b;
	Scanner sc1=new Scanner (System.in);
	System.out.println("Please Enter the first number");
	a=sc1.nextInt();
	System.out.println("Please Enter the Second number");
	b=sc1.nextInt();
	 sc1.close();
	
		

}
}

