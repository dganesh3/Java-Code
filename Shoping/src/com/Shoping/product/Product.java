package com.Shoping.product;

import java.util.Scanner;

public class Product 
{
	String cprod;
	String product[]= {"jeans","shirts","t-shirts","jockets","cargos"};	
	public void productlist()
	{
		for(int i=0;i<product.length-1;i++)
		{
			System.out.println(product[i]+" , ");
		}
	}
	public String displayproduct()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product");
		String ch = sc.nextLine();
		for(int i=0;i<product.length;i++)
		{
			if(product[i].equals(ch))
			{
				cprod = product[i];
			}
		}
		return cprod;
	}
	public void seachproduct(int n)
	{
		
	}
}
