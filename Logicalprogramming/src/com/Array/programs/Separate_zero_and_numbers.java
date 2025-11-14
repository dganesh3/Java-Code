package com.Array.programs;

public class Separate_zero_and_numbers 
{
	public static int[] right(int [] num)
	{
		int[] res=new int[num.length];
		int j=res[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		//print(num);
		print(res);
		return res;
	}
	public static void print(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,0,5,6,0,2,0};
		right(num);
		
	}

}
