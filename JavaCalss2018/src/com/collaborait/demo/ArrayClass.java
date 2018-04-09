package com.collaborait.demo;

public class ArrayClass {
	
	public static void main(String[] args) {
//		int arr []= {2,3,4,5};
//		for (int i:arr) {
//			System.out.println(i);
//		}
		//for each loop example
		
		float z []= {10.5f,5.6f, 12.4f};
		for (float j:z) {
			System.out.println(j);
			
		}
		//for loop example
		
		for (int m=0; m<z.length; m++) {
			System.out.println(z[m]);
		
		}
		
		char mychar[]= {'A','B','C','D'};
		for (char h:mychar) {
			System.out.println(h);
		
	}
		
		
		for (int n=0; n<mychar.length; n++) {
			System.out.println(mychar[n]);
		
			}
		
		String name[]= {"Dave", "Jhon", "Mamo"};
		for (String st:name) {
			System.out.println(st);
		}
		
		for (int y=0; y<name.length; y++) {
			System.out.println(name[y]);
		
			}	
		
}
}
