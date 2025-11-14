package com.Shoping.utilize;

import java.util.Scanner;

import com.Shoping.Account.Account;
import com.Shoping.Account.Transaction;
import com.Shoping.implemenation.Upi;
import com.Shoping.product.Product;
import com.Shoping.services.Productservices;

public class Customer
{
	

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		Upi up;
		Account a1 = new Account();
		Transaction t1 = new Transaction();
		Productservices ps = new Productservices();
		System.out.println("-----welcome to shopping --------");
		System.out.println("The available  poducts are ..");
		
		Scanner sc = new Scanner(System.in);
		
		p1.productlist();
		
		String prod = p1.displayproduct();
		
		System.out.println(prod);
		
		if(prod == "jeans")
		{
			double amt = 2000;
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			up = ps.login(pin, a1);
			System.out.println(up);
			
			System.out.println("Confirm Purchase ?");
			System.out.println("1. YES    2.NO");
			
			int ch = sc.nextInt();
			
			if(ch==1)
			{
				t1.withdraw(amt, a1);
			}
			else if(ch==2)
			{
				return;
			}
			
		}
		
		//System.out.println("displayproduct");

	}

}
