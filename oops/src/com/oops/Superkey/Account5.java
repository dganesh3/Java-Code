package com.oops.Superkey;
 class Account4
{
	 	long accNo;
	 	double bal;
	 	String owner;
	 	public void deposit(double amt)
	 	{
	 		if(amt>=0)
	 		{
	 			bal=bal+amt;
	 			System.out.println("deposit sucess ="+bal);
	 		}
	 		else
	 		{
	 			System.out.println("low bal so add min bal");
	 		}
	 	}
	 	public void withdraw(double amt)
	 	{
	 		if(bal>=0 && amt<=bal)
	 		{
	 			bal=bal-amt;
	 			System.out.println("withdrw sucess ="+bal);
	 		}
	 		else
	 		{
	 			System.out.println("to withdraw low bal ");
	 		}
	 	}
	 }
	 class savings extends Account4
	 {
		 double roi=0.05;
	 	 public void deoisit(int amt)
	 	{
	 		super.deposit(amt);
	 	}
	 	public void withdraw(int amt)
	 	{
	 		super.withdraw(amt);
	 	} 
	 	
	 	
	 	public void calculateRoi()
	 	{
	 		
	 		bal=bal+bal*0.05;
	 		System.out.println("roi="+bal);
	 	}
	 }
	 class Current extends Account4
	 {
		 double minbal=1000;
	 	public void deposit(int amt)
	 	{
	 		super.deposit(amt);
	 	}
	 	 
	 	
	 	 public void withdraw(int amt)
	 	 {
	 		 if(bal-amt>=minbal)
	 		 {
	 			  super.withdraw(amt);                                                        
	 			//bal=bal-amt;
	 			// System.out.println("over ridden withdraw sucess=="+bal);
	 		 }
	 		 else
	 		 {
	 			 System.out.println(" over ridden insufficient bal");
	 		 }
	 		
	 		 
	 	 }
	 }


	 public class Account5
	 
	 {
	      public static void main(String[] args)
	      {
	     	// Account4 a1= new Account4();
	     	 
	     	 savings s1=new savings();
	     	 s1.deposit(6000);
	     	 s1.withdraw(3000);
	     	 s1.calculateRoi();
	     	 System.out.println("-----------------");
	     	 Current c1=new Current();	     	
	     	 c1.deposit(5000);
	     	 c1.withdraw(4500);
	 	}
	 }

