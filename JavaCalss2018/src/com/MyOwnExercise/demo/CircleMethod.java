package com.MyOwnExercise.demo;

public class CircleMethod {
	
	
	String sName;
	String sID;
	String sSex;
	public String showInfor()
	{
		System.out.println(sName+ " "+ sID);	
		return(sName+sID);
	}
	
	public static void main (String[] args) {

	
	CircleMethod St=new CircleMethod();
	St.sName="Daniel";
	St.sID="12005";
	St.sSex="Male";
	St.showInfor();
			
	}
/*
		float rad;
		int xcord, ycord;
		void showArea() 
		
		{
			float  area = rad*rad;
			System.out.println("the area is:"+" "+ area);
				
		}
		
		void showcircumstance ()
		{
			float circum=2*xcord/ycord;
			System.out.println(" the circumstance is:"+" "+ circum);
		}
		
		
		public static void main (String[] args)
		{
			CircleMethod X= new CircleMethod();
			X.rad=32;
			X.xcord=6;
			X.ycord=7;
			X.showArea();
			X.showcircumstance();
			
		}
		*/
		
	}

