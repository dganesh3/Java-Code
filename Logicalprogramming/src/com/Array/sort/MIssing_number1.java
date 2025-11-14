package com.Array.sort;

public class MIssing_number1 
{
	public static int check(int[] num,int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			boolean b=false;
			for(int j=0;j<=num.length-1;j++)
			{
				if(i==num[j])
				{
					b=true;
					break;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		return i;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,5,4,6,8,9,10};
		System.out.println(check(num,num.length+2));

	}
}
