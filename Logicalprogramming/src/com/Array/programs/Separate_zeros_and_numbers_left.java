package com.Array.programs;

public class Separate_zeros_and_numbers_left 
{
	public static int[] left(int[] num)
	{
		int[] res=new int[num.length];
		int j=res.length-1;
		for(int i=num.length-1;i>=0;i--)
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j--;
			}
		}
		print(num);
		print(res);
		return res;
	}
	public static void print(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] num= {1,0,2,0,3,0,4,0};
		left(num);
	}
}
