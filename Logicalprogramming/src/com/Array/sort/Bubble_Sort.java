package com.Array.sort;

import java.util.Arrays;

public class Bubble_Sort 
{
	public static int[] sort(int[] n)
	{
		//	int c=0;
		//	print(n);
		for(int i=0;i<=n.length-1;i++)
		{
			//		boolean b=false;
			for(int j=0;j<=n.length-2;j++)
			{
				//		c++;
				if(n[j]>n[j+1])
				{
					//		b=true;
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
			/*	if(b==false)//it is second method of bubble sort 
			{
				break;	
			}*/
		}
		//	System.out.println(c);
		//print(n);
		System.out.println(Arrays.toString(n));
		return n;
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
		int[] n= {5,2,1,7,2,3,4};
		sort(n);

	}
}
