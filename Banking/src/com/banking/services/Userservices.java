package com.banking.services;

import com.banking.account.Account;
import com.banking.implementation.Googlepay;
import com.banking.implementation.Phonepe;
import com.banking.implementation.User;

public class Userservices 
{
	User u1;
	public User login(int pin,Account a1)
	{
		if(pin==1111)
		{
			u1=new Phonepe(a1);
			return u1;
		}
		else if(pin==2222)
		{
			u1=new Googlepay(a1);
			return u1;
		}
		else 
		{
			return null;
		}
	}

}
