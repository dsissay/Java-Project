package com.JavaCollectionClasses.demo;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main (String[] args ) {

		myTreeSet ();
	}
	
	
	public static void myTreeSet() {
		
		/*
		 * This are some of the common tree set elements
		 * 
		 */
		TreeSet <Object> tr=new TreeSet <Object>();
		tr.add("IT");
		tr.add("Geography");
		tr.add("Math");
		tr.add(new String ("Ahysics"));
		tr.add("Amharic");
	// using comparator in TreeSet

		TreeSet <Object> tr1=new TreeSet <Object>();
		tr1.clone();
		//System.out.println(tr);
		System.out.println(tr);
	}

}
