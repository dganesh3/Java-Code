package com.Shoping.implemenation;

import java.util.Scanner;

import com.Shoping.Account.Account;
import com.Shoping.Account.Transaction;

public class Googlepay implements Upi 
{

	Account a1;
	public Googlepay(Account a1) 
	{
		this.a1 = a1;
	}

	@Override
	public void transfer(double amt, Transaction t1) 
	{
		System.out.println("welcome to googlepay");
		System.out.println("1.send ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			t1.withdraw(amt, a1);
			t1.checkbalance(a1);
		}

		else
		{
			System.out.println("insuffient balance");
		}
		sc.close();
	}
}


