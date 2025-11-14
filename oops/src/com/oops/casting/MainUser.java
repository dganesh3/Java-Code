package com.oops.casting;

class user
{

}
class customer extends user
{
	public void buyproduct()
	{
		System.out.println("customer can buy product");
	}
	public void cancelproduct()
	{
		System.out.println("customer can cancel product");
	}

}
class admin extends user
{
	public void addproduct()
	{
		System.out.println("admin can add product");
	}
	public void removeproduct()
	{
		System.out.println("admin can remove product");
	}
}
class loginpage
{
	public user login(user u1)			//upcasting reference
	{
		if(u1 instanceof customer)
		{
			return u1;
		}
		else
		{
			return u1;
		}

	}

}
public class MainUser 
{

	public static void main(String[] args) 
	{
		loginpage lp=new loginpage();
		customer c1=(customer)lp.login(new customer());//down casting ref
		c1.buyproduct();//here user can decide which u want:buy or cancel
		c1.cancelproduct();
		admin a1=(admin)lp.login(new admin());//down casting ref
		a1.addproduct();
		a1.removeproduct();

	}

}
