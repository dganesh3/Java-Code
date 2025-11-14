package com.forloops.numbers;

import java.util.Scanner;

public class Squareofnum {
	
	public static int pow(int n,int p)
	{
		int result = n;
		for(int i=1;i<p;i++)
		{
			result = result*n;
		}
		return result;
	}
	public static void main(String[] args)
	{
	//	int res=(int)Math.pow(10,3);
	//	System.out.println(res);
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter n values");
		int n=sc.nextInt();
		System.out.println("Enter p value");
		int p =sc.nextInt();
		System.out.println(pow(n,p));
		sc.close();

	}

}
