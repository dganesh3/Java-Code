package com.oops.Hasa;
class Adress
{
	String Place;
	String doorno;
	String street;
	public Adress(String place, String doorno, String street) 
	{
		super();
		this.Place = place;
		this.doorno = doorno;
		this.street = street;
	}
	public void homeadress(String place)
	{
		if(place=="mpl")
		{
			System.out.println("home");
		}
		else
		{
			System.out.println("invalid  adress");
		}
	}
	public void Schooladress(String place)
	{
		if(place=="bangalore")
		{
			System.out.println("jspiders");
		}
		else
		{
			System.out.println("some where is present");
		}
	}
}
class Student
{
	
	String name;
	long phno;
	Adress a1;
	public Student(String name, long phno, Adress a1) 
	{
		super();
		this.name = name;
		this.phno = phno;
		this.a1 = a1;
	}
	public void permanentadress(String place)
	{
		a1.homeadress(place);
	}
	public void currentadress(String place)
	{
		a1.Schooladress(place);
	}
}
public class MainUser1 
{
	public static void main(String[] args) 
	{
		Adress a1=new Adress("mpl","9-37","9th cross");
	    Student s1=new Student("ganesh",9879363l,a1);
	    s1.permanentadress("mpl");
	    s1.currentadress("bangalore");
	}
	
}
