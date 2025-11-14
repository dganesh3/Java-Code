package com.loops.numbers;

import java.util.Scanner;

public class Right_side_rotation 
{
	public static int rotate(int n)
	{
		int n1=n/10;
		 int n2=n%10;
		int t=n1;
		int res=1;
		while(t>0)
		{
			res=res*10;
			t=t/10;
		}
		return n2*res+n1;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int a=sc.nextInt();
	System.out.println(rotate(a));
	
}
}
