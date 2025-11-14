package com.Array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergingTwoArrays 
{
	public static int[] merge(int[] n1,int[] n2)
	{
		int[] res=new int[n1.length+n2.length];
		int j=0;
		for(int i=0;i<=res.length-1;i++)
		{
			if(i<=n1.length-1)
			{
				res[i]=n1[i];
			}
			else
			{
				res[i]=n2[j];
				j++;
			}
		}
		print(res);
		System.out.println(Arrays.toString(res));
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n1=sc.nextInt();
		int[] num1=new int[n1];
		System.out.println("Enter first array elements");
		for(int i=0;i<=n1-1;i++)
		{
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array");
		int n2=sc.nextInt();
		int[] num2=new int[n2];
		System.out.println("Enter second array elements");
		for(int i=0;i<=n2-1;i++)
		{
			num2[i]=sc.nextInt();
		}
//		int[] n1= {1,2,3,9};
//		int[] n2= {5,6,7,8,9,34};
		merge(num1,num2);
		sc.close();

	}
}
