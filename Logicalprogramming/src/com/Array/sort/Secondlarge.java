package com.Array.sort;

public class Secondlarge 
{
	public static int max(int[] n)
	{
		int fmax=n[0];
		int smax=-1;
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]>fmax)
			{
				smax=fmax;
				fmax=n[i];
			}
			if(n[i]>smax&&n[i]<fmax)
			{
				smax=n[i];
			}
		}
		return smax;
	}
	public static void main(String[] args) 
	{
		int[] n= {1,2,3,5,6,7,84,94,0};
		System.out.println(max(n));
	}
}
