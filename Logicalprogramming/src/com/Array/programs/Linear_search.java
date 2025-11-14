package com.Array.programs;

public class Linear_search 
{
	public static boolean search(int[] num,int key)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean check(int[] num,int key)
	{
		int l=num[0];
		int h=num.length-1;
		int mid=(l+h)/2;
		while(l<=h)
		{
			if(num[mid]==key)
			{
				return true;
			}
			else if(key<num[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			mid=(l+h)/2;
		}
		return false;
	}
public static void main(String[] args) 
{
	int[] num= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(check(num,3));
}
}
