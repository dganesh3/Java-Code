package com.encapsulation;

public class Transaction 
{
	public void deposit(double amt,Account a1)
	{
		if(amt>0)
		{
			a1.setBalance(a1.getBalance()+amt);
			System.out.println(a1.getBalance());
		}
		else
		{
			System.out.println("invalid transaction");
		}
	}

	public void withdraw(double amt,Account a1)
	{
		if(amt>0&&a1.getBalance()>=amt)
		{
			a1.setBalance(a1.getBalance()-amt);
			System.out.println(a1.getBalance());
		}
		else
		{
			System.out.println("insuffient amt");
		}
	}
	public void checkbalance(Account a1)
	{
		System.out.println("current bal :"+a1.getBalance());
	}


}

