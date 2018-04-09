package com.collaborait.demo;
import java.util.Scanner;

public class TenaryOprator {

	public static void  main (String[] args) {
		
		//int num1, num2;
		//num1=25;
		//num2=(num1==10)? 100:200;
		//System.out.println(num2);
		
		
		 int a;
		 int b;
		 int c;
		 int la;
		 int la2;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First number: " );
		 a=sc.nextInt();
		 System.out.println("Enter Second number: " );
		 b=sc.nextInt();
		 System.out.println("Enter Third number: " );
		 c=sc.nextInt();
		 
		 sc.close();
		
		 la=(a>b)? a:b;
		 
		 la2=(la>c)? la:c;
		 
			System.out.println("the Largest number is " + la2);
		
		
	}
}

