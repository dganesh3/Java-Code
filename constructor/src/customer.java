public class customer
{
	String name;
	int balance;
	int pin;
	long phNo;
	int bankCode;
	customer(String n,long pn,int b)
	{
		this.name=n;
		this.phNo=pn;
		this.bankCode=b;
	}
	void setpin(int p)
	{
		this.pin=p;
		System.out.println("pin updated");
	}
void updatephNo(int p,long npn)
{
	if(this.pin==p)
	{
		this.phNo=npn;
		System.out.println("Phone number Updated");
	}
	else
	{
		System.out.println("incorrect pin");
	}
}
	void deposit(int p,int a)
	{
		if(this.pin==p)
		{
			System.out.println("The Deposited Amount is: "+a);
			this.balance=this.balance+a;
			System.out.println("The Balance is: "+this.balance);
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}
	void checkBalance(int p)
	{
		if(this.pin==p)
		{
			System.out.println("The Current Balance is: "+this.balance);
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}
	void updatePin(int p,int np)
	{
		if(this.pin==p)
		{
			this.pin=np;
			System.out.println("Pin Updated");
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}
	void withdraw(int p,int a)
	{
		if(this.pin==p)
		{
			if(a<=this.balance)
			{
				System.out.println("The WithDraw amount: "+a);
				this.balance=this.balance-a;
				System.out.println("The Balance After Withdraw: "+this.balance);
			}
		
		else
		{
			System.out.println("incorrect pin");
		}
	}
}
	public static void main(String[] args) 
	{
		customer c1=new customer("ganesh",7702609305l,12354);
		c1.setpin(1234);
		c1.updatephNo(1234, 8106608165l);
		c1.deposit(1234,560000);
		c1.checkBalance(1234);
		c1.updatePin(1234,4321 );
		c1.withdraw(4321,70000);
	}
}
