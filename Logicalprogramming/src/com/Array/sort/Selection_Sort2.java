package com.Array.sort;

import java.util.Scanner;

public class Selection_Sort2 
{

	public static int[] sort(int[] n)
	{
		int c=0;
		print(n);
		for(int i=0;i<=n.length-2;i++)
		{
			c++;
			int s=i;
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[s]>n[j])
				{
					s=j;
				}	
			}
			int temp=n[i];
			n[i]=n[s];
			n[s]=temp;
		}
		System.out.println(c);
		print(n);
		//System.out.println(Arrays.toString(n));
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
//		System.out.println(Arrays.toString(n));
//		Arrays.sort(n);		// inbuilt method
//		System.out.println(Arrays.toString(n));
		sc.close();

	}


}
