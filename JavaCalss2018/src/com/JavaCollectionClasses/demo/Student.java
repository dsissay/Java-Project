package com.JavaCollectionClasses.demo;

public class Student {

	String sName;
	String sDepa;
	int age;
	public Student(String sName, String sDepa, int age) {
		super();
		this.sName = sName;
		this.sDepa = sDepa;
		this.age = age;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsDepa() {
		return sDepa;
	}
	public void setsDepa(String sDepa) {
		this.sDepa = sDepa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sDepa=" + sDepa + ", age=" + age + ", getsName()=" + getsName()
				+ ", getsDepa()=" + getsDepa() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
