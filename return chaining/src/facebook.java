
public class facebook 
{
	static void login(String emailid,String pwd)
	{
		System.out.println("login via email-id");
	}
static void login(long phno,String pwd)
{
	System.out.println("login via phno");
}
public static void main(String[] args) {
	login("Ganesh12@gmail.com","Java@123");
	login("7702609305","Java@555");
}
}
