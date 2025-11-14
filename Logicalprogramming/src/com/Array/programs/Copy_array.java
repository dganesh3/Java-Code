package com.Array.programs;

public class Copy_array 
{
	public static int[] copyarray(int[] num)
	{
		int[] res=new int[num.length];

		for(int i=0;i<=num.length-1;i++)
		{
			res[i]=num[i];
		}
		printarray(res);
		return res;
	}
	public static void printarray(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6,7};
		copyarray(num);
	}
}
