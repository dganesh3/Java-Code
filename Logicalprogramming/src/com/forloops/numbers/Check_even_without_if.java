package com.forloops.numbers;

import java.util.Scanner;

public class Check_even_without_if
{
	public static void checkeven(int n)
	{
		switch(n%2)
		{
		case 0:System.out.println(n+"----> it is even number");
		break;
		case 1:System.out.println(n+"-->it is odd number");
		}
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	checkeven(a);
	sc.close();

}
}
