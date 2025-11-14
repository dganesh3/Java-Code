package com.banking.implementation;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class Googlepay implements User 
{
	Account a1;
	public Googlepay(Account a1) 
	{
		this.a1 = a1;
	}

	@Override
	public void transfer(double amt, Transaction t1) 
	{
		System.out.println("welcome to Googlepay");
		System.out.println("1.send 2.receive");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			t1.withdraw(amt, a1);
			t1.checkbalance(a1);
		}
		else if(choice==2)
		{
			t1.deposit(amt, a1);
			t1.checkbalance(a1);
		}
		else
		{
			System.out.println("invalid");
		}
		sc.close();


	}


}
