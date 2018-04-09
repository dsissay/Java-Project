package com.CalculatorExample.demo;

import java.util.Scanner;

public class SimpleCalculator {
	
public static void main(String[] args) {
	
	//instantiating a new object from Calculator method Class
	
	CalculatorMethod cal=new CalculatorMethod();
	
	//Providing a menue option for suing swith Statment
		
	int menue;
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("        ==============================================");
	System.out.println("             SIMPLE ARTHEMETIC CALCULATOR IN JAVA");
	System.out.println("        ==============================================");
	System.out.println("           	Press 1 for Addion");
	System.out.println("           	Press 2 for Substraction");
	System.out.println("            	Press 3 for Multiplication");
	System.out.println("            	Press 4 for Division");
	System.out.println("            	Press any other number to Exit");
	System.out.println("        ==============================================");
	menue=sc.nextInt();
	//sc.close();

			
		switch (menue)
		
		{
		case 1://case one for addition
			
			double a;
			
			//taking the first number from the user
			Scanner sc1=new Scanner(System.in);
			System.out.println ("Enter First number:");
			a=sc1.nextInt();
		

			double b;
			//taking the second number from the user
			System.out.println ("Emnter Second Number:");
			b=sc1.nextInt(); 
			sc1.close();
			//display the result back to the user
			double result=cal.sum(a,b);
			System.out.println(result);
			break;
		case 2:
			//int a;
			//taking the first number from the user
			Scanner sc2=new Scanner(System.in);
			System.out.println ("Enter First number:");
			a=sc2.nextInt();
		

			//int b;
			//taking the second number from the user
			System.out.println ("Emnter Second Number:");
			b=sc2.nextInt(); 
			sc2.close();
			//display the result back to the user
			result=cal.sub(a,b);
			System.out.println(result);
			break;
			
		case 3:
			//int a;
			//taking the first number from the user
			Scanner sc3=new Scanner(System.in);
			System.out.println ("Enter First number:");
			a=sc3.nextInt();
		

			//int b;
			//taking the second number from the user
			System.out.println ("Emnter Second Number:");
			b=sc3.nextInt(); 
			sc3.close();
			//display the result back to the user
			result=cal.mul(a,b);
			System.out.println(result);
			break;
		case 4:
			//int a;
			//taking the first number from the user
			Scanner sc4=new Scanner(System.in);
			System.out.println ("Enter First number:");
			a=sc4.nextInt();
		

			//int b;
			//taking the second number from the user
			System.out.println ("Emnter Second Number:");
			b=sc4.nextInt(); 
			sc4.close();
			//display the result back to the user
			if (b==0)
			{
				System.out.println ("Halas! a number canot be divided by zero!");
				break;
			}
			result=cal.div(a,b);
			System.out.println(result);
			break;
			
			default:
				System.out.println("Good bye......");
				break;
		}
				
				
			}
		
}
