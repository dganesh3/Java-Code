package com.Shoping.implemenation;

import java.util.Scanner;

import com.Shoping.Account.Account;
import com.Shoping.Account.Transaction;

public class Phonepe implements Upi 
{

	Account a1;
	public Phonepe(Account a1) 
	{
		this.a1 = a1;
	}

	@Override
	public void transfer(double amt, Transaction t1) 
	{
		System.out.println("welcome to phonepe");
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


