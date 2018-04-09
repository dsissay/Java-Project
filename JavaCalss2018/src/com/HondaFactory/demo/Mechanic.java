package com.HondaFactory.demo;



public class Mechanic {

	public static void main (String[] args)
	
	{
		Car c1=new CRV();
		c1.hasCarbody();
		c1.hasEngine();
		
		CRV cr=new CRV();
		cr.hasWheel();
		
		Car c2=new Accord();
		c2.hasCarbody();
		c2.hasEngine();
		
		Accord ar=new Accord();
		ar.hasWheel();
		
		Car c3=new Civic();
		c3.hasCarbody();
		c3.hasEngine();
		
		Civic cv=new Civic();
		cv.hasWheel();
		
	}
	
}
