package com.Array.programs;

public class Left_rotation 
{
	public static int[] left(int[] num)
	{
		int first=num[0];
		for(int i=0;i<=num.length-2;i++)
		{
			num[i]=num[i+1];
		}
		num[num.length-1]=first;
		Copy_array.printarray(num);
		return num;
	}
//	public static void print(int[] n)
//	{
//		for(int i=0;i<=n.length-1;i++)
//		{
//			System.out.print(n[i]+" ");
//		}
//		System.out.println();
//	}
	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5,6,7};
		left(num);
	}
}
