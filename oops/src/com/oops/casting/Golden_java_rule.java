package com.oops.casting;
class parent
{
	public  void test()//2      --> excute
	{
		System.out.println("hello");
	}
	
}
class child extends parent
{
	@Override
	public  void test()
	{
		System.out.println("java");//3   ---> print
	}
	
}
public class Golden_java_rule 
{

	public static void main(String[] args) 
	{
		parent p1=new child();
		p1.test();//1   --> start
	}

}
