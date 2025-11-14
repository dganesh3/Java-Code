package com.oops.Abstract;
abstract class sample
{
public abstract	void test();
}
class child extends sample
{
	@Override
	public void test()
	{
		System.out.println("test overriden method of abstract class");
	}
}

public class Main1 {

	public static void main(String[] args)
	{
	sample s1;	
	child c1=new child();
	c1.test();
	}

}
