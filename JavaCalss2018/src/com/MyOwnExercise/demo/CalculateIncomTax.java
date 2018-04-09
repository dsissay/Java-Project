package com.MyOwnExercise.demo;

import java.util.Scanner;

public class CalculateIncomTax {
	
	
		public static void main(String[] args){
			
			char r='A';
	        char ch;
	        String inputText;
	        Scanner sc=new Scanner(System.in);
	        int charAscii;
	        int charAscii1;
	        
	        /*we want to read character the problem is
	         * Scanner doesn't have a method to accept character
	         * so lets accept a string and take the first character of
	         * the string as our input
	         */
	        System.out.println("Enter character");
	        inputText=sc.next();//accept a string
	        ch=inputText.charAt(0);// take the first character of the string 
	        charAscii=(int)ch; //convert to int to get its ascii
	        
	        charAscii1=(int)r;
	        System.out.println("The Ascii is " + charAscii);
	        System.out.println("The Ascii is " + charAscii1);
    }

}
