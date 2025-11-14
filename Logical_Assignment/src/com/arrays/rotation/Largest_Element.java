package com.arrays.rotation;

public class Largest_Element 
{
	public static int check(int []n)
	{
		int max=n[0];
		for(int i=1;i<=n.length-1;i++)
		{
			if(n[i]>max)
			{
				max=n[i];

			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] n= {1,2,3,4,58,97,40};
		System.out.println(check(n));

	}
}
