package com.Array.programs;

public class Prime_numbers_Array 
{
	public static void prime(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			if(checkprime2(num[i])==true)
			{
				System.out.print(num[i]+" ");
			}
		}
	}
	
	public static boolean checkprime2(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if(n==2||n==3)
		{
			return true;
		}
		else if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		int[] num= {2,3,4,5,6,7,8,11};
		prime(num);

	}

}
