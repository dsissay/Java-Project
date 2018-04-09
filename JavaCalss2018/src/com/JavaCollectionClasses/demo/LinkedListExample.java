package com.JavaCollectionClasses.demo;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListExample {
	
	public static void main (String[] args ) {
		LinkedList();
		myLinkedList();
		
	}
	
	public static void LinkedList() {
		
		LinkedList <String> lk = new LinkedList<>();
		
		lk.add("Dc");
		lk.add("Gojam");
		lk.add("Addis Ababa");
		 System.out.println("List of city"+ lk);
		 lk.addFirst("Chicago");
		 lk.addLast("Vegas");
		 
		 System.out.println("After Adding City "+ lk);
	  Object firstvar=lk.get(0);
	    Object thirdvar= lk.get(3);

	System.out.println(firstvar +" "+ thirdvar);
		
	lk.set(0,"AAA");
	lk.set(3,"Ethiop");
	
	// this is an example of array list
	ArrayList <String> arrlist= new ArrayList <String> ();
	arrlist.add("Gonder");
	arrlist.add("DireDe");
	
	// this an example to add all the values from array to linked list
	lk.addAll(arrlist);
	
	System.out.println(lk);
	//this is how to print an index of ana array
	System.out.println("index for gojam"+ lk.indexOf("Gojam"));
	
	// This is how to delete all the array value
	lk.clear();
	System.out.println(lk);
	
	}
	
	
	public static void myLinkedList() {
		LinkedList <Integer> lk2 = new LinkedList<>();
		
		//this is for each loop example
		
		for (int i=0; i<10;i++) {
			lk2.add(i, i);
		}
		System.out.println(lk2);
	
	
	LinkedList <Integer> lk3 = new LinkedList<>();
	
   int j=0;
   while (j<10) {
	   
	   lk3.add(j, j);
		
		j++;
		
	}
   System.out.println(lk3);
   
   //This is for Loop Example
   for (int m: lk3) {
	   System.out.println(m);
	   
   }
   
   //Using Iterator
   Iterator<Integer> it=lk3.iterator();
   
   while (it.hasNext()) {
	   System.out.println(it.next());
   }
   
   //using ListItrator Example
   ListIterator<?> listit=new lk3.ListIterator ();
   
   
   while (listit.hasNext()) {
	   System.out.println(listit.next());
   }
   
   while (listit.hasPrevious()) {
	   System.out.println(listit.previous());
   }
	}
	
}
