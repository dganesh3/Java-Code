
public class test
{
	static void display1()
	{
		System.out.println("d1");
		display2();
		}
	static void display2()
	{
		System.out.println("d2");
		}
	public static void main(String[] args) {
		display1();
	}
}
