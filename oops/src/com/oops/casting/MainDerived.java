package com.oops.casting;

class Father
{
	int a=5;
	public void end()
	{
		System.out.println("end");
	}
}
class Son  extends Father
{
	int b=10;
	public void start()
	{
		System.out.println("start");
	}
	
}
public class MainDerived 
{
	public static void main(String[] args) {
		Son c1=new Son();
		c1.start();
		c1.end();
		
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
