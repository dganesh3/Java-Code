package com.revision.methods;

public class MYArray {

	public static void main(String[] args) 
	{
		Array a1=new Array(5,3);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.display();
		System.out.println(a1.capacity());
		a1.remove(2);
		a1.display();
		
		

	}

}
