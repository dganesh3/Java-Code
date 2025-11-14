package com.oops.casting;

public class Pass_by_value 
{
	public static int test(int a)   //2  //called
	{
		char c1='A';
		return c1;  // pass by value step 1
	}
	public static void main(String[] args) //calling
	{
		System.out.println(test(5));   //1
		int i1=test('B');
		System.out.println(i1);
		
	}

}
