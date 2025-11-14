package com.dsa.linkedlist;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		MyLinkedList m1=new MyLinkedList();
		m1.add(10);
		m1.add(20);
		m1.add(30);
		m1.add(40);
		m1.add(50);
	//	m1.addFront(5);
		m1.display();
		//m1.head=head;
		System.out.println(m1.linearSearch(3));
		m1.display();
	}
}
