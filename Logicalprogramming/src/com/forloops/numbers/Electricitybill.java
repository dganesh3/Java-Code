package com.forloops.numbers;

import java.util.Scanner;

public class Electricitybill
{
public static double bill(int units)
{
	double amt=0;
	for(int i=1;i<=units;i++)
	{
		if(i<=50)
		{
			amt=amt+0.50;
		}
		else if(i>=51&&i<=150)
		{
			amt=amt+0.75;
		}
		else if(i>=151&&i<=250)
		{
			amt=amt+1.20;
		}
		else 
		{
			amt=amt+1.50;
		}
		System.out.println(i+"-->"+amt);
	}
	return amt+(amt*0.20);
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter units");
	int a=sc.nextInt();
	System.out.println(bill(a));
	sc.close();

	}
}
