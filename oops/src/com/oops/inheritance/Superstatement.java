package com.oops.inheritance;

class sample
{
	public sample(int a)
	{
		super();
		
		System.out.println("sample() class constructor");
	}
}
class demo extends sample
{
	public demo(int a)
	{
		super(a);
		System.out.println("demo class constructor");
	}
}
class test extends demo
{
  public test(int a)
  {
	  super(a);
	  System.out.println("test class constructor");
  }
}
public class Superstatement
{
	public static void main(String[] args) 
	{
		test t1=new test(50);
	}
}

