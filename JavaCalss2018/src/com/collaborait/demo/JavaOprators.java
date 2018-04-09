package com.collaborait.demo;

public class JavaOprators {
//Basic Arithmetic Oprators
	//Assignment oprators
	//=, +=, -=, *=, /=,%=
	//Auto increment and autho decrementa
	//logical operators
	
			// && and  || or ! 
	//comparison /relational operators
	// ==,!= >,<, >=, <=
	//ternary operators
	//variable num1 =(expression) ? value if true: value if false;
	
	public static void  main (String[] args) {
		
		int a=10;
		int b=20;
		b=a;
		//System.out.println("Output;" +  a);
		b=a+=a;

		//System.out.println("Output;" +  b);
		
		b=b-=a;
		//System.out.println("Output;" +  b);
		
		
		/*int j=a;
		int d=a+=a;
		//int h=b-=b;
		int c= a*=b;
		
		int e=a/=b;
		
		
		int f=a%=b;
		
		System.out.println("Output; "+ j );
		System.out.println("Output; "+ d );
		//System.out.println("Output; "+ h );
		System.out.println("Output; "+ c );
	
		System.out.println("Output; "+ e );
		System.out.println("Output; "+ f );
		*/
		
		
		//boolean b1=true;
		//boolean b2=false;
		
		int n1=25;
		int n2=30;
		
		System.out.println(n1==n2);
		
		System.out.println(n1!=n2);
		System.out.println(n1>n2);
		System.out.println(n1<n2);
		System.out.println(n1>=n2);
		
		System.out.println(n1<=n2);
		//System.out.println(b1&&b2);
		
	}
	
}
