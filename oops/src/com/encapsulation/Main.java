package com.encapsulation;

public class Main 
{
	public static void main(String[] args)
	{
		Transaction t1= new Transaction();
		Account a1=new Account ();
		t1.deposit(5000.0,a1);
		t1.withdraw(900, a1);
	}
}
