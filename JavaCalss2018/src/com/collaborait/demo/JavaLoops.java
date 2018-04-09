package com.collaborait.demo;

public class JavaLoops {
	public static void main(String[] args) {
		//we have four types of loops in java
		// simple for loop
			///	enhanced for each loop
		//----mostly used in array
			////while loop
			////do while loop
			////continue statments
			////break statments
		// Java for Loops
		
		int i=0;
		for (i=0;i<10; i++) {
			System.out.println(i);
			i++;
		}
		
		int arr[]= {2,4,6,7,9,};
		
		///String names= {"john", "Dave", "Mamo");
		
		for (int j=0; j<arr.length; j++) {
			System.out.println(j);
		}
	}
		
	
	//Enhanced for loop
	int arr[]= {2,3,4,567};
	
	for (int hi:arr) 
	{
		System.out.println(hi);		
	}
			
}
}

