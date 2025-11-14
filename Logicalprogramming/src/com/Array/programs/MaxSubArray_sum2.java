package com.Array.programs;

import java.util.Scanner;

public class MaxSubArray_sum2 
{
	public static long maxsum(int[] num,int n)
	{
		long max=Long.MIN_VALUE;
		long sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum=sum+num[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println(maxsum(num,n));
		sc.close();
	}
}
