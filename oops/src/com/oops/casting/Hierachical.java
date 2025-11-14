package com.oops.casting;
class A
{

}
class B extends A
{

}
class C extends A
{
	public static void test(A a1)
	{
		System.out.println("A a1="+a1);
	}
	public static void test(B b1)
	{
		System.out.println("B b1="+b1);

	}

}
public class Hierachical
{
	public static void main(String[] args)
	{
	//	A a1=new A();
	//	B b1=new B();
	//	C c1=new C();
		C.test(new A());
		C.test(new B());
		C.test(new C());


	}

}
