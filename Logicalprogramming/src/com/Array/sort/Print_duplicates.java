package com.Array.sort;

import java.util.Scanner;

public class Print_duplicates 
{
	public static void printarray(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int c=1;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					c++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1&&c>1)
			{
				System.out.print(num[i]+" ");
			}
		}
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
		printarray(num);
		sc.close();

	}
}
