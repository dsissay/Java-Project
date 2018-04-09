package com.collaborait.demo;

public class Person2 {
	
	public static void main (String [] args)
	{
		Person1 pr=new Person1();
		
		pr.adress="Verginia";
		pr.pnumber=12345;
		pr.getnumber();
		
	System.out.println( pr.adress);
	System.out.println( pr.pnumber);
	
		
Person1 pr2=new Person1();
	
	pr2.adress="aa";
	pr2.pnumber=190345;
	
	System.out.println( pr2.adress);
	System.out.println( pr2.pnumber);
	
		
	Person1 pr3=new Person1();
	
	pr3.adress="Gonder";
	pr3.pnumber=97865;
	
	System.out.println( pr3.adress);
	System.out.println( pr3.pnumber);
		
	}

}
