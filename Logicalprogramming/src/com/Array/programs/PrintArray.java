package com.Array.programs;

public class PrintArray 
{
	public static void print(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}
		
	}
	public static void main(String[] args)
	{
		int [] num= {1,2,3,4,5};
		print(num);
		
	}
}


