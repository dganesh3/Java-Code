package com.banking.utilize;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.implementation.User;
import com.banking.services.Userservices;

public class MAinuser 
{

	public static void main(String[] args) 
	{
		Userservices us=new Userservices();
		Account a1=new Account();
		Transaction t1=new Transaction();

		System.out.println("-----welcome to banking app------");
		System.out.println("1.login");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("enter pin");
			int pin=sc.nextInt();
			User u1=us.login(pin,a1);
			System.out.println("welcome to "+u1);
			System.out.println("1.transfer");
			int choice1=sc.nextInt();
			if(choice1==1)
			{
				System.out.println("enter your amount");
				double amt=sc.nextDouble();
				u1.transfer(amt, t1);
			}
			else
			{
				System.out.println("invalid operation");
			}
			sc.close();
		}

	}

}
