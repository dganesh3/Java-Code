package com.Array.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort 
{
	public static int[] sort(int[] n)
	{
			//print(n);
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]>n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		sort(num);
		sc.close();

	}

}
