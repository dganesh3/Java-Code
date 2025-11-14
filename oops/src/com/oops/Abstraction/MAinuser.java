package com.oops.Abstraction;
interface Hotel
{
	public void orderfood();	//9
}
class Veghotel implements Hotel
{
	public void orderfood()
	{
		System.out.println("veg food is ordered"); 		// 10
	}
}
class Nonveghotel implements Hotel
{

	public void orderfood()
	{
		System.out.println("non-veg food is ordered");
	}
}
class Selecthotel
{
	Hotel h1;
	public Hotel selecttypeofhotel(String colour)	//3
	{
		if(colour=="green")  // 4(true)
		{
			h1=new Veghotel();	//5
			return h1;	//6
		}
		else
		{
			h1=new Nonveghotel();
			return h1;
		}
	}
}
public class MAinuser 
{
	public static void main(String[] args) 
	{
		Selecthotel sh=new Selecthotel();	// 1
		Hotel h1=sh.selecttypeofhotel("green"); //2 and //7
		h1.orderfood(); // 8
		Hotel h2=sh.selecttypeofhotel("red");
		h2.orderfood();
	}

}
