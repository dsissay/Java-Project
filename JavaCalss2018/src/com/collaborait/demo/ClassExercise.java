package com.collaborait.demo;

public class ClassExercise {
	public static void main (String[] args) 
	{
		String st="Welcome Java Proghraming";
		char ch1=st.charAt(0);
		
		char ch2=st.charAt(5);
		char ch3=st.charAt(11);
		char ch4=st.charAt(20);
		
		System.out.println("Character at 0 Index is:"+ ch1);
		System.out.println("Character at 5 Index is:"+ ch2);
		System.out.println("Character at 11 Index is:"+ ch3);
		System.out.println("Character at 20 Index is:"+ ch4);
	
int i=10;
float f=10.10f;
long hj=10001;
char abb[]= {'a','b','c'};
String mn=String.valueOf (i);

String mf=String.valueOf (f);
String mc=String.valueOf (hj);
String bn=new String (abb);
		
System.out.println(mn);
System.out.println(mf);
System.out.println(mc);
System.out.println(bn);
	}
	
}
