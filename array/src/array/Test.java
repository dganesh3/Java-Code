package array;
class Test 
{
	public static void Test()
	{
		System.out.println("Comstructor");
	}
	
	
}
class A extends Test
{
	public A()
	{
		super();
		System.out.println("A");
	}
}
class Main
{
	public static void main(String[] args) {
		A a1=new A();
		
	}
}
