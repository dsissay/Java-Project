package com.JavaCollectionClasses.demo;


import java.util.ArrayList;


public class ArrayList1 {
	/*
	 * We have two types of Interface (Collection Interface and Map Interface)
	 * Collection  interface
	 * =============
	 * List 
	 *	 -ArreyList
	 *	 -LinkedList
	 *	 -Vector
	 * Set 
	 * 	 -HashSet
	 * 	 -LinkedHashSet
	 * 	 -TreeSet
	 * Queue
	 * 	 -LinkedList
	 * 	 -PriorityQueue
	 * 
	 * Map Interface
	 * ==============
	 * 	  -HashTable
	 *    -LinkedHashMap
	 *    -HashMap
	 *    -TreeMap
	 */

	//This is an example of linkedList 
	public static void main (String [] args) {
		myArrayList();
		
	}
	public static void myArrayList() {
		ArrayList<String> link = new ArrayList<>();	
		link.add("Daniel");
		link.add("Beyene");
		link.add("Sissay");
		
		System.out.println(link);
		
	}
	
	
	
	
	
	
	
}
