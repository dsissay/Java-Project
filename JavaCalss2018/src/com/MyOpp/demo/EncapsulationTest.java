package com.MyOpp.demo;

public class EncapsulationTest {

	public static void main (String [] args)
	{
		Abstraction ab=new Abstraction();
		ab.setEmpName("Daniel");
		ab.setSsn(4567);
		System.out.println(ab.getEmpName());
		
	}
}
