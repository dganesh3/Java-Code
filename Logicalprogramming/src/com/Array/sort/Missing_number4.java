package com.Array.sort;

public class Missing_number4 
{
	public static int test(int[] num,int n)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum1=sum1^(i+1);
			sum2=sum2^num[i];
		}
		sum1=sum1^n;
		return sum1^sum2;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,7};
		System.out.println(test(num,num.length+1));

	}
}
