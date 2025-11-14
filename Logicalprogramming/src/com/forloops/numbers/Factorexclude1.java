package com.forloops.numbers;

import java.util.Scanner;

public class Factorexclude1
{
	public static void factor(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
	 int a=sc.nextInt();
	factor(a);
	sc.close();

}
}
