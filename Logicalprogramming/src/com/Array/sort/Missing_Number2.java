package com.Array.sort;

public class Missing_Number2 
{
	public static int check(int[] num,int n)
	{
		int[] res=new int[n+1];
		for(int i=0;i<=num.length-1;i++)
		{
			res[num[i]]=1;
		}
		int i=1;
		for(i=1;i<=res.length-1;i++)
		{
			if(res[i]==0)
			{
				break;
			}
		}
		return i;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,7,8,9};
		System.out.println(check(num,num.length+1));

	}
}
