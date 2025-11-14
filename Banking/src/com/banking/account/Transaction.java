package com.banking.account;

public class Transaction 
{
	public void deposit(double amt,Account a1)
	{
		if(amt>0)
		{
			a1.setBal(a1.getBal()+amt);
		}
		else
		{
			System.out.println("invalid transaction");
		}
	}

	public void withdraw(double amt,Account a1)
	{
		if(amt>0&&a1.getBal()>=amt)
		{
			a1.setBal(a1.getBal()-amt);
		}
		else
		{
			System.out.println("insuffient amt");
		}
	}
	public void checkbalance(Account a1)
	{
		System.out.println("current bal :"+a1.getBal());
	}
}
