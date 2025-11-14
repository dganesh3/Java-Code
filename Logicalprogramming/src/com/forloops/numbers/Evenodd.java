package com.forloops.numbers;

import java.util.Scanner;

public class Evenodd 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		int sum = 0;
		int add=0;
		System.out.println("enter no.of values you want");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			if(num%2==0)
			{
				evencount++;
				sum = sum+num;
			}
			else
			{
				oddcount++;
				add=add+num;
				
			}
		}
		System.out.println("evencount is:"+evencount);
		System.out.println("Total is "+sum);
		System.out.println("oddcount is:"+oddcount);
		System.out.println("Total is "+add);
		sc.close();
		
	}

}
