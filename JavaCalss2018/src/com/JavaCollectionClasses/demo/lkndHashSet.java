package com.JavaCollectionClasses.demo;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class lkndHashSet {

	public static void main (String[] args ) {

		lkndHash ();
	}

	public static void lkndHash () {
		
		LinkedHashSet <String> vc=new LinkedHashSet<>();
		String st;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pleas Enter the First Name");
		st=sc.nextLine();
		vc.add(st);
		System.out.println("Pleas Enter the Middle Name");
		
		st=sc.nextLine();
		vc.add(st);
		
		System.out.println("Pleas Enter the Last Name");
		st=sc.nextLine();
		vc.add(st);
		sc.close();
		
	System.out.println(vc);
		
	}
	
}
