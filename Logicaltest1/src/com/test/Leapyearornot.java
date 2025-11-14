package com.test;

import java.util.Scanner;

public class Leapyearornot 
{
public static boolean year(int n)
{
	if(n%100==0&&n%400==0)
	{
		return true;
	}
	else if(n%100!=0&&n%4==0)
	{
		return true;
	}
	else 
	{
		return false;
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter year");
int n=sc.nextInt();
System.out.println(year(n));

}
}
