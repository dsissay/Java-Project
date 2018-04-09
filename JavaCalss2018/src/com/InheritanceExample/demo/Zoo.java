package com.InheritanceExample.demo;

public class Zoo {
	
	public static void main (String [] args) {
	Animal a1=new Dog();
	a1.makeNoice();
	a1.move();
	
	Dog dg=new Dog ();
	dg.drinkMilk();
	
	Cat ct=new Cat ();
	ct.drinkMilk();
	
	Animal a2=new Cat();
	a2.makeNoice();
	a2.move();
	

			
	}
}
