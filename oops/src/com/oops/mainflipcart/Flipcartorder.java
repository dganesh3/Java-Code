package com.oops.mainflipcart;

import java.util.Scanner;

class Flipkartorder 
{
	public void orderproduct()
	{
		System.out.println("order placed");
	}
}
class  fashion extends Flipkartorder
{
	public void mensfashion()
	{
		System.out.println("mensfashion is selected");
		System.out.println("1.buy 2.add to cart 3.cancel");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderproduct();
		}
		else if(choice==2)
		{
			System.out.println("added to cart");
		}
		else if (choice==3)
		{
			System.out.println("the order cancelled");
		}
		else
		{
			System.out.println("invalid choice");
		}
	}
	public void womensfashion()
	{
		System.out.println("womensfashion is selected");
		System.out.println("1.buy 2.add to cart 3.cancel");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			orderproduct();
		}
		else if(choice==2)
		{
			System.out.println("added to cart");
		}
		else if(choice==3)
		{
			System.out.println("the order cancelled");
		}
		else
		{
			System.out.println("invalid choice");
		}
	}
}
	class electronics extends Flipkartorder
	{
		public void mobiles()
		{
			System.out.println("mobile is selected");
			System.out.println("1.buy 2.add to cart 3.cancel");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				orderproduct();
			}
			else if(choice==2)
			{
				System.out.println("added to cart");
			}
			else if(choice==3)
			{
				System.out.println("the order cancelled");
			}
			else
			{
				System.out.println("invalid choice");
			}

		}
		public void laptops()
		{
			System.out.println("laptop is selected");
			System.out.println("1.buy 2.add to cart 3.cancel");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				orderproduct();
			}
			else if(choice==2)
			{
				System.out.println("added to cart");
			}
			else if(choice==3)
			{
				System.out.println("the order cancelled");
			}
			else
			{
				System.out.println("invalid choice");
			}
		}
	}
//	class grocery extends Flipkartorder
//	{
//
//	}
	class fashionbrands extends fashion
	{
		public void puma()
		{
			System.out.println("puma is selected");
			System.out.println("select order for \n 1.mensfashion 2.womensfashion");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				mensfashion();
			}
			else if(choice==2)
			{
				womensfashion();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		}
		public void nike()
		{
			System.out.println("nike is selected");
			System.out.println("select order for \n 1.mensfashion 2.womensfashion");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				mensfashion();
			}
			else if(choice==2)
			{
				womensfashion();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		}
	public void arrow()
	{
		System.out.println("arrow is selected");
		System.out.println("select order for \n 1.mensfashion ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			mensfashion();
		}
		else 
		{
			System.out.println("invalid choice");
		}
	}
}
	class electronicbrands extends electronics
	{
		public void dell()
		{
			System.out.println("dell is selected");
			System.out.println("select order for \n 1.laptops");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				laptops();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		}
		public void apple()
		{
			System.out.println("apple is selected");
			System.out.println("select order for \n 1.mobiles 2.laptops");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				mobiles();
			}
			else if(choice==2)
			{
				laptops();
			}
			else
			{
				System.out.println("invalid choice");
			}
		}
		public void samsung()
		{
			System.out.println("samsung is selected");
			System.out.println("select order for \n 1.mobiles 2.laptops");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				mobiles();
			}
			else if(choice==2)
			{
				laptops();
			}
			else
			{
				System.out.println("invalid choice");
			}

		}
	}
	public class Flipcartorder
	{
		public static void main(String[] args) 
		{
			System.out.println("-------welcome to m5m3 shopping app-------");
			System.out.println("--1.fashionbrands 2.elelctronics 3.grocery");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:fashionbrands f1=new fashionbrands();
			System.out.println("select your brand \n 1.puma 2.nike 3.arrow");
			System.out.println("enter your brand");
			int brand=sc.nextInt();
			if(brand==1)
			{
				f1.puma();
			}
			else if (brand==2)
			{
				f1.nike();
			}
			else if(brand==3)
			{
				f1.arrow();
			}
			else 
			{
				System.out.println("invalid choice");
			}

			}
		}
	}
