package com.Array.sort;

public class Array_is_sorted_or_not 
{
	public static boolean check(int[] num)
	{
		for(int i=0;i<=num.length-2;i++)
		{
			if(num[i]>num[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int [] n= {1,2,3,4,5,6};
		System.out.println(check(n));

	}
}
