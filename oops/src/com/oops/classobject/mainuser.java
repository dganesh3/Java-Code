package com.oops.classobject;
import java.util.*;
public class mainuser {
	public static void main(String[] args)
	{
		System.out.println("Welcome to User");
		System.out.println("1. user 2.service");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{ 
		case 1:
		 case 2:Service s1=new Service();
		 int choice1=sc.nextInt();
		 if(choice1==1)
		 {
			 System.out.println(" enter your email");
			 System.out.println("enter your password");
			 User u1=new User();
			 s1.signup("email","pw", u1);
		 }
		}
		
		
	}

}
