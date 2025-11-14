package com.Shoping.Account;

public class Transaction 
{
	public void withdraw(double amt,Account a1)
	{
		if(amt>0&&a1.getBal()>=amt)
		{
			a1.setBal(a1.getBal()-amt);
			System.out.println(a1.getBal());
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
