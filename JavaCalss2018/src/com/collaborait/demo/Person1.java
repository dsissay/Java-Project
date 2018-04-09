package com.collaborait.demo;

public class Person1 {
	
	String adress;
	int pnumber;
	
	
	public Person1(String adress, int pnumber) {
		super();
		this.adress = adress;
		this.pnumber = pnumber;
	}


	public Person1 () 
{
		super();	
}

	public void getnumber() {
		System.out.println(adress +" " + pnumber);
	}

}
