package com.oops.interface1;
interface run1
{
	public void test();	
}
interface run2 extends run1
{

	public void count();
}
public class Main1 implements run2
{

	public void main1()
	{
		
		System.out.println("demo");
	}

	public void count()
	{

		System.out.println("count() abstract of run2 is overridden");
	}
	public void test()
	{

		System.out.println("test() abstract of run1 is overridden");
	}

	public static void main(String[] args) 
	{
		Main1 m1=new Main1();
		m1.count();
		m1.test();
	}

}
