package com.forloops.numbers;
import java.util.Scanner;
public class Multiplication
{
	public static void print(int n)
	{
	  int mul =0;
	  for(int i=1;i<=10;i++)
	   {
		 mul=n*i;
		 System.out.println(mul);
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




