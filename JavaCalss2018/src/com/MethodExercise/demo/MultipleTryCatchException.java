package com.MethodExercise.demo;

public class MultipleTryCatchException {
	
	public static void main (String [] args)
	{
	Tryit();
	}
	public static void Tryit()
	
	{
		
		try {
			
		int [] arr= {3,5,6,78,89};
		for (int i=0; i<5; i++) {
			System.out.println(arr[i]);
			int num2=60/0;
			
		}
			
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			
			System.out.println("You are out of bound");
	}
		catch (ArithmeticException e1) 
		{
			
			System.out.println("Number can't be devided by zero");
	}
		catch (Exception e2) 
		{
			
			System.out.println("This is Anothe Exeption");
	}
		//it is not like else
		finally {
			System.out.println("This is you final word");
		}
}
}


