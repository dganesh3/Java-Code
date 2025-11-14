package com.Shoping.services;

import com.Shoping.Account.Account;
import com.Shoping.implemenation.Googlepay;
import com.Shoping.implemenation.Phonepe;
import com.Shoping.implemenation.Upi;

public class Productservices 
{
	
		Upi u1;
	
		public Upi login(int pin,Account a1)
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
				return  u1;
				
			}
		}

	}


