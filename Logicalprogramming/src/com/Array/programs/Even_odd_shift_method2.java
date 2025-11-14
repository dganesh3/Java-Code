package com.Array.programs;

import java.util.Arrays;

public class Even_odd_shift_method2 
{
	public static int[] shift(int[] num )//O(N)-->n
	{
		int[] res=new int[num.length];
		int m=num.length-1;
		int n=res.length-1;
		int j=0;//even
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				res[j]=num[i];
				j++;
			}
			if(num[m]%2==1)
			{
				res[n]=num[m];
				n--;
			}
			m--;
		}
		print(res);// user defined method
		System.out.println(Arrays.toString(res));//pre_difened method
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
		int[] num= {1,2,3,4,5,6,7,8,9};
		shift(num);

	}
}
