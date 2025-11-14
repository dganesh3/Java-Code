package com.lib.exception;

public class SAmple_using_finally_block
{
	public static void test(int a)
	{
		try
		{
			int res=1000/a;
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				int[] a1= {1,90,80};
				System.out.println(a1[a]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("--radha krishna--");
			}
		
		}
	}
public static void main(String[] args) 
{
	test(0);
	System.out.println("---------");
	test(1);
	System.out.println("---------");
	test(5);
	System.out.println("continue.......");
	
}
}
