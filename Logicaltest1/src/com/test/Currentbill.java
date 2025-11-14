package com.test;

import java.util.Scanner;

public class Currentbill 
{
	public static double bill(int units)
	{

		if(units<=100)
		{
			return 2*100;
		}
		else if(units>=101&&units<=200)
		{
			return (units-100)*4.50+2*100;
		}
		else if(units>=201&&units<=500)
		{
			return(units-200)*6+2*100+100*4.50;
		}
		else if(units>=501)
		{
			return (units-500)*7+300*6+100*4.50;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter units");
			int units=sc.nextInt();
			System.out.println(bill(units));

		}
	}
}
