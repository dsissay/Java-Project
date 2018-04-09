package com.collaborait.demo;
import java.util.Scanner;
public class ExerciseElseIf {
	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Your Number: ");
		x = sc.nextInt();
		
		sc.close();
		
		if (x > 0) {
			System.out.print("It is a postive number");
		} else if (x <0) {
			System.out.print("IT is a Negative");
		} else {
			System.out.print("The Number is Zero");
		}
				
		
	}

}
