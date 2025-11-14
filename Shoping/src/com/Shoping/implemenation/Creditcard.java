package com.Shoping.implemenation;

import com.Shoping.Account.Account;
import com.Shoping.Account.Transaction;

public class Creditcard 
{
	Account a1;
	public Creditcard(Account a1)
	{	
		this.a1 = a1;
	}
	public void payment(double amt,Transaction t1)
	{
		double limit=50000.0;
		if(limit>=amt)
		{
			t1.withdraw(amt, a1);
			t1.checkbalance(a1);
		}
		else
		{
			System.out.println("amount limit excededd");
		}
	}

}
