package com.javalibrary.objectclass;

public class Obeject_methods_override 
{
	@Override
	public int hashCode()
	{
		return 300;
	}
	@Override
	public String toString()
	{
		return "overriden toString()";
	}
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
	public static void main(String[] args) 
	{
		Obeject_methods_override o1=new Obeject_methods_override();
		Obeject_methods_override o2=new Obeject_methods_override();
		System.out.println("----hashcode----");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println("----tostring()----");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("----equals(object obj)----");
		System.out.println(o1.equals(o2));


	}
}
