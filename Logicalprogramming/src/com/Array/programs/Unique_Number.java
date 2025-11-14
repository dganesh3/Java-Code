package com.Array.programs;

public class Unique_Number 
{
	public static boolean check(int n)
	{
		int t1=n;
		while(t1>0)
		{
			int t2=t1/10;
			int rem=t1%10;
			while(t2>0)
			{
				int r1=t2%10;
				System.out.println(rem+" "+r1);
				if(rem==r1)
				{
					return false;
				}
				t2=t2/10;
			}
			t1=t1/10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(check(256));
		
	}

}
