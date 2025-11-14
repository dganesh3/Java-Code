	
	public class Bankaccount 
	{
			static String accname="sbi";
			String name;
			long accno;
			double bal;
			public Bankaccount(String name,long accno,double bal)
			{
				this.name=name;
				this.accno=accno;
				this.bal=bal;
//				System.out.println("account name is :"+this.accname);
//				System.out.println(" name is :"+this.name);
//				System.out.println("account number is :"+this.accno);
//				System.out.println("account balance is :"+this.bal);
//				System.out.println("---------");
			}
			public void deposit(double amt)
			{
				if(amt>0)
				{
					bal=bal+amt;
					
					System.out.println(" deposit balance is :"+amt);
					System.out.println("current balance is :"+bal);
					System.out.println("account name is :"+this.accname);
					System.out.println(" name is :"+this.name);
					System.out.println("account number is :"+this.accno);
					System.out.println("---------");
			
				}
				else {
					System.out.println("inavalid amt");
				}
			}
			public void withdraw(double amt)
			{
				if(amt>0&bal>amt)
				{
					bal=bal-amt;
					System.out.println("withdraw amount is :"+amt);
					System.out.println("current balance is :"+bal);
					System.out.println("account name is :"+this.accname);
					System.out.println(" name is :"+this.name);
					System.out.println("account number is :"+this.accno);
					System.out.println("---------");
			
				}
				else {
					System.out.println("insuffient bal !!!");
				}
			}
			public static void main(String[] args) {
				Bankaccount b1=new Bankaccount("raja",34567987,6000.0);
				Bankaccount b2=new Bankaccount("phani",3734567,6000.0);
			
				b1.deposit(2000);
				b1.withdraw(3000);
				
//				b2.deposit(9000);
//				b2.withdraw(8000);
				
			}
	}