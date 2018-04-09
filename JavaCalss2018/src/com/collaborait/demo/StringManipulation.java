package com.collaborait.demo;

public class StringManipulation {
	public static void main (String[] args)
	
	{
		
		String str1=new String ("Hello");
		String str2=new String ("Hi");
		String str3=new String ("HELLO");
		
		System.out.println(str3.equals(str2));
		System.out.println(str1.toUpperCase().equals(str3));
		
		
		String str4=new String("The Qciuck for Jump over the Lazy dog");
		
		System.out.println(str4.substring(0, str4.length()/2));
		//System.out.println(str1.equals(str2));
		
		System.out.println(str4.indexOf("Jump"));
		
		
		String st=new String ("This is a String");
		System.out.println(st.join ("-","This","Is","Java"));
		//st.join(st, args)
		
		
//		String arr[]=new String {"mike","Dave"};
//		String names=String.join("|", arr);
//		System.out.println(names);
		
		String st6=new String ("How are you");
		System.out.println(st6.trim());
		
	}

}
