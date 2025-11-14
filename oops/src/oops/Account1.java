package oops;

class Web implements User
{

	@Override
	public void transfer() {
System.out.println("web");		
	}
	
}
class Transaction {
//	User u1;
	public User login(int pin)
	{
		if(pin==1234)
		{
		User u1=new Atm();
			return u1;
		}
		else
		{
		User u1=new Web();
			return u1;
			
		}
	}
}
public class Account1
{
	public static void main(String[] args) {
		Transaction t1=new Transaction();
		User u1=t1.login(1234);
		u1.transfer();
	}

}
