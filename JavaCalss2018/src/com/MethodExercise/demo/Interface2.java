package com.MethodExercise.demo;

public class Interface2 implements Interface,Interface3{
	public  void startButton()
	{
		System.out.print("Start the Washing Machine \n");
		
	}
	
	public void stopButton()
	{
		
		System.out.print("Stop the Washing Mashine");
	}
	public static void main (String [] args) {
		Interface2 it =new Interface2();
		it.startButton();
		
		//Interface2 it2=new Interface2();
		it.stopButton();
		
	}
}
