package com.oops.classobject;

public class Service
{
public void signup(String email,String pw,User u1)
{
	u1.setEmail(email);
	u1.setPw(pw);
}
public void login(String email,String pw,User u1)
{
	if(u1.getEmail()==email && u1.getPw()==pw)
	{
		System.out.println("Login Successfully");
		
	}
	else
	{
		System.out.println("Invalid email or pw");
	}
}
}
