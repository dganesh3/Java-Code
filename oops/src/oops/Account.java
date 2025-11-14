package oops;

public class Account
{
	String name;
	long accno;
	String branch;
	String ifsc;
	double bal;
	static String bankname;
	public void createAccount(String name,long accno,String branch,String ifsc)
	{
		// intialize data to data members
		this.name=name;
		this.accno=accno;
		this.branch=branch;
		this.ifsc=ifsc;
	}
	public void displayaccountdetails()
	{
		System.out.println(name+",\n"+accno+",\n"+branch+",\n"+ifsc);
	}
	public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
		System.out.println("deposit bal is:"+bal);
	}
	}
	public void withdraw(double amt)
	{
		if(bal>=amt&& amt>=0)
		{
			bal=bal-amt;
			System.out.println("current bal is :"+bal);
		}
		else
		{
			System.out.println("insuffient balance");
		}
	}
	public static void main(String[] args) {
		Account a1=new Account();
		// intialize data to account 
		// a1.name="rahul"; a1.accno=12340l; a1.branch=btm; a1.ifsc="sbin076";
		a1. createAccount("ram",12340l,"btm","sbin076");
		a1.displayaccountdetails();
		a1.deposit(5000.0);
		a1.withdraw(4000.0);
		System.out.println("-------------------------");
		Account a2=new Account();
		a2.createAccount("rohit", 1205l,"mg road","sbin078");	
		a2.displayaccountdetails();
	}

}
