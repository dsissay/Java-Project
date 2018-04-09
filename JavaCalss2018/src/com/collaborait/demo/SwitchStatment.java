package com.collaborait.demo;

import java.util.Scanner;

public class SwitchStatment {
	public static void main(String[] args) {
		
//		int num=2;
//		switch (num+2)
//		{
//		case 1:
//			System.out.println("Output1 ");
//		case 2:
//			System.out.println("Output2 ");
//		case 3:
//			System.out.println("Output3");
//
//			default:
//				System.out.println("un known case");
//				break;
//
//		}
		
		String name="Danny";
		
		/*
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Your Name: ");
		name = sc.toString();*/
		
		//sc.close();
		//sc.nextchar();
		switch (name) 
		{
		
		case "Danny":
			System.out.println("Your Name is Danny" );
			break;
		case "Jonny":
			System.out.println("Your Name is Jonny" );
			break;
		case "Dave":
			System.out.println("Your Name is Dave" );
			break;
			default:
		System.out.println("I didn't get your name" );
			break;
			
			
			
	}
	}
}


