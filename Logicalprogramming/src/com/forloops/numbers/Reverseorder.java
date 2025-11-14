package com.forloops.numbers;
import java.util.Scanner;
public class Reverseorder 
{
	public static void print(int n)
	{

		for(int i=n;i>=1;i--)
		{
			System.out.println(i);

		}

	} 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter n values");
		int n=sc.nextInt();
		print(n);
		sc.close();

	}
}

