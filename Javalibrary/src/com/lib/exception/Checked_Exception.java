package com.lib.exception;

public class Checked_Exception 
{
	public static void test() throws Exception
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println("---hello--");
		}
		finally
		{
			try
			{
			throw new NullPointerException();		
			}
			catch(NullPointerException e)
			{
				System.out.println("---radha krishna---");
			}
		}
	}
	public static void main(String[] args) throws Exception 
	{
		test();
	}
}
