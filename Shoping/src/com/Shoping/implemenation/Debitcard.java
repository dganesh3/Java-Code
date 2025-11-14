package com.Shoping.implemenation;

import com.Shoping.Account.Account;
import com.Shoping.Account.Transaction;

public class Debitcard 
{
	int pin;
	Account a1;
	public Debitcard( Account a1)
	{
	
		this.a1 = a1;
	}
	public void payment(double amt,Transaction t1)
	{
				if(a1.getBal()>amt)
		{
			t1.withdraw(amt, a1);
			t1.checkbalance(a1);
		}
		else
		{
			System.out.println("insuffient balance");
		}
	}
}
