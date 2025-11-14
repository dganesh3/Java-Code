package com.Array.programs;

import java.util.Arrays;

public class Merging_Array 
{
	public static int[] merge(int[] n1,int[] n2)
	{
		int[] res=new int[n1.length+n2.length];
		int x=0;
		for(int i=0;i<=n1.length-1;i++)
		{
			//res[i]=n1[i]; -->without extra variable
			res[x]=n1[i];//---> with extra variable
			x++;
		}
		for(int j=0;j<=n2.length-1;j++)
		{
			//res[n1.length+j]=n2[j];//---> without extra variable
			res[x]=n2[j];//----> with extra variable
			x++;

		}
		print(res);
		System.out.println(Arrays.toString(res));
		System.out.println(x);
		return res;
	}
	public static void print(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
			{
				System.out.print(num[i]+" ");
			}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		
		int []n1= {1,2,3};
		int[] n2= {5,6,7,8,9,34};
		merge(n1,n2);
		
	}
}
