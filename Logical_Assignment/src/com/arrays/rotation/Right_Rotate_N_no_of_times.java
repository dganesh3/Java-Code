package com.arrays.rotation;

import java.util.Arrays;

public class Right_Rotate_N_no_of_times 
{
	public static int[] right(int[] n,int m)
	{
		for(int i=1;i<=m;i++)
		{
			int last=n[n.length-1];
			for(int j=n.length-1;j>=1;j--)
			{
				n[j]=n[j-1];
			}
			n[0]=last;
			System.out.println(Arrays.toString(n));

		}
		return n;
	}
	public static void main(String[] args) {
		int []n= {1,2,3,4,5,6};
		right(n,3);
	}


}
