package com.collaborait.demo;

public class ContinueBreak {

	
	public static void main(String[] args) {
		int i=10;
		while (i>0) 
		{
			if (i==7)
			{
				i--;
				continue;
			}
			
			System.out.println(i);
			i--;
		}
		
		int num;
		for (num=100; num>=10; num--)
		{
			System.out.println("num"+num);
			if (num==99)
			{
				break;
			}
			System.out.println("out of loop");
		}
		
		
		
		
	}
}
