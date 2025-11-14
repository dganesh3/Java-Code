package com.arrays.rotation;

public class Smallest_Element 
{
	public static int check(int []n)
	{
		int min=n[0];
		for(int i=1;i<=n.length-1;i++)
		{
			if(n[i]<min)
			{
				min=n[i];

			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int[] n= {98,0,2,0,3,4,58,97,40};
		System.out.println(check(n));

	}

}
