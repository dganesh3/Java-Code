package com.forloops.numbers;

import java.util.Scanner;

public class Factorswithin5 
{
 public static void factor(int n)
 {
	 for(int i=2;i<n;i++)
	 {
		 if(n%i==0)
		 {
			 if(i<=5)
			 {
				 System.out.println("true");
				 System.out.println(i);
			 }
			 else
			 {
				 System.out.println("false");
			 }
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
