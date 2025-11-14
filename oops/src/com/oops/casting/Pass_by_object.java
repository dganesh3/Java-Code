package com.oops.casting;
class A5
{
	
}
class sample extends A5
{
	public static A5 test(A5 a1) // pass by return type is object ref
	{
		return a1;
	}
	
}
public class Pass_by_object 
{

	public static void main(String[] args) 
	
	{
		sample s1=(sample)sample.test(new sample());
		A5 a1=sample.test(new sample());
		A5 a2=sample.test(new A5());
		System.out.println(s1);
		System.out.println(a1);
		System.out.println(a2);

	}

}
