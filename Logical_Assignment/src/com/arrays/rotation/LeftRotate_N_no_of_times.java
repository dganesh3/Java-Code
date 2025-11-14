package com.arrays.rotation;

import java.util.Arrays;

public class LeftRotate_N_no_of_times 
{
	public static int[] left(int[] n,int m)
	{
		for(int i=1;i<=m;i++)
		{
			int first=n[0];
			for(int j=0;j<=n.length-2;j++)
			{
				n[j]=n[j+1];
			}
			n[n.length-1]=first;
			System.out.println(Arrays.toString(n));

		}
		return n;
	}
	public static void main(String[] args) {
		int []n= {1,2,3,4,5,6};
		left(n,3);
	}
}
