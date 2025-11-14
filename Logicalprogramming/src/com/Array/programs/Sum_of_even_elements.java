package com.Array.programs;

public class Sum_of_even_elements 
{
	public static void print(int[] num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				sum=sum+num[i];
			}
		}
		System.out.println("sum of even elements :"+sum);
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6};
		print(num);
	}
}
