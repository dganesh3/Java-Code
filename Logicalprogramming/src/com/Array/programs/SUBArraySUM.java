package com.Array.programs;

public class SUBArraySUM 
{
	public static int maxsum(int[] num)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=num.length-1;i++)
		{
			int sum=0;
			for(int j=i;j<=num.length-1;j++)
			{
				sum=sum+num[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		return max;
	}
public static void main(String[] args) 
{
	int[] num= {1,-1,2,-3,6,-9};
	System.out.println(maxsum(num));
	
}
}
