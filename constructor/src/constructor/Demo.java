package constructor;
interface Test1{
	
}
 abstract class Test 
{
	  abstract  void run();
	public Test()
	{
		
	}
	static{
		
	}

}
 public class Demo extends Test
 {
	 

	@Override
	public void run() 
	{
		System.out.println("run");
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.run();
		
	}
	 
 }
