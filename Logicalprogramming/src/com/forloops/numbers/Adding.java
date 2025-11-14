package com.forloops.numbers;

import java.util.Scanner;

 public class Adding
{
    
     public static int print(int n)
	{
	   int sum=0;
	  for(int i=1;i<=n;i++)
	   {
		sum=sum+i;
		
	    }
		return sum;
	} 
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter n values");
	int n=sc.nextInt();
	System.out.print(print(n));
	sc.close();

	}
}
 
