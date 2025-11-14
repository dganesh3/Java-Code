package com.encapsulation;
public class Account 
{
	private String name;
	private long acno;
	private double Balance;
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno)
	{
		this.acno = acno;
	}
	public double getBalance()
	{
		return Balance;
	}
	public void setBalance(double balance) 
	{
		this.Balance = balance;
	}

}
