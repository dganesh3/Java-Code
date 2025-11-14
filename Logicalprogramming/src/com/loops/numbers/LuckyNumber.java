package com.loops.numbers;

public class LuckyNumber 
{
	public static boolean checklucky(int n)
	{
		if(n<=9&&n==1)
		{
			return true;
		}
		int sum=add(n);
		while(sum>9)
		{
			sum=add(sum);
		}
		if(sum==1)
		{
			return true;
		}
		return false;
	}
	public static int add(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(checklucky(2786));
		
	}

}
