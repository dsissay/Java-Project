package com.MyOwnExercise.demo;

public class ConstructorEx2 {
String name;
int a;
public ConstructorEx2(String name, int a) {
	super();
	this.name = name;
	this.a = a;
}

	ConstructorEx2()
	{
		this.name="alemu";
		this.a=23;
		
	}
	
	public static void main (String[] args)
	
	{
		ConstructorEx2 con=new ConstructorEx2 ();
		System.out.println(con.name);
		
		ConstructorEx2 con1=new ConstructorEx2();
		con1.a=89;
		System.out.println(con.a);
		
		ConstructorEx2 con3=new ConstructorEx2("Daniel", 2);
		System.out.println(con3.name);
		System.out.println(con3.a);
	}
	
}
