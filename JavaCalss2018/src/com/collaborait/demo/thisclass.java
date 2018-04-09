package com.collaborait.demo;
import java.util.Scanner;
public class thisclass {

		public static void  main (String[] args) {
			float num1=3.5f;
			float num2=6.5f;
			float num3=num1*num2;
			
			 System.out.println("Enter First number: "+ num1 );
			 System.out.println("Enter second number: "+ num2 );
			 System.out.println("OutPut: "+ num3 );
			 
			 
			 int a;
			 int b;
			 int sum;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter First number: " );
			 a=sc.nextInt();
			 System.out.println("Enter Second number: " );
			 b=sc.nextInt();
			 sc.close();
			 
			 sum=a+b;
			 System.out.println("The total output is: "+ sum);
		}
	}
		


