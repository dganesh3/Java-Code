package com.lib.exception;

public class SAmple 
{
	public static void test(int a)
	{
		try 
		{
			int res=1000/a;
			System.out.println(res);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception handled");
			//ae.printStackTrace();// in built method to display exception by user
		}
		finally {
			try {
				int arr[]= {1,2,3};
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array solved");
			}
		}
	}
public static void main(String[] args) 
{
	test(1);
	System.out.println("------------------");
	test(0);
	System.out.println("------------------");
	test(2);
	System.out.println(" RADHA KRIHNA");
	
}
}
