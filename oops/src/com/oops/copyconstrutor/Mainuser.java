package com.oops.copyconstrutor;
 class Student
{
	String name;
	public Student(Student s1)
	{
		this.name=s1.name;
		
	}
	public Student (String name)
	{
		this.name=name;
	}
}
public class Mainuser
{
	public static void main(String[] args) 
	{
	Student s1=new Student("vamsi");
	Student s2=new Student(s1);
	System.out.println(s1.name);
	System.out.println(s2.name);
	}
}