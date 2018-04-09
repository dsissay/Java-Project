package com.collaborait.demo;

public class ClassandObject {

String webName;
int webAge;
ClassandObject (String webName, int webAge)
{
	this.webName=webName;
	this.webAge=webAge;
	
}

public static void main (String [] args) 
{
	
	ClassandObject C1=new ClassandObject ("abc.com",2);
	ClassandObject C2=new ClassandObject ("jala.com",4);
	
	System.out.println(C1.webName + C1.webAge);
	
}

}

