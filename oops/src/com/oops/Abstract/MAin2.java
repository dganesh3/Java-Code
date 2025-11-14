package com.oops.Abstract;

abstract class Amazon
{
	  abstract public void login();
	abstract void logout();
}
class Customer extends Amazon
{

	public void login()
	{
		System.out.println("Login");
	}

	void logout()
	{
		System.out.println("Logout");
	}
}
 class MAin2
 {
	public static void main(String[] args) {
		
		Customer c1=new Customer();
		c1.login();
		c1.logout();
	}
}

