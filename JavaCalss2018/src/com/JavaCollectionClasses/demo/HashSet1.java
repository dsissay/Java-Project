package com.JavaCollectionClasses.demo;

import java.util.HashSet;

public class HashSet1 {
	
	//Hash set doesn't  Mainatain order
	//tree set maintains order

	public static void main (String[] args ) {
		myHashSet();
		myowndata();
	}
	public static void myHashSet() {
		
		HashSet <String> hs=new HashSet <> ();
		hs.add("Addis");
		hs.add ("Gojam");
		hs.add("gonder");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
	}
		
	//Calling the student Class from this example a custom class
	//here i created a student class with all the necessary constructor gettter and seter method
	
	public static void myowndata() {
		HashSet <Student> st=new HashSet <> ();
		st.add(new Student ("Dan","IT",23));
		st.add(new Student ("ME","IT",24));
		st.add(new Student ("kem","Chemistry",2));
		System.out.println(st);
	}
}
