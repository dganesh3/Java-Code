package com.dsa.queue;

public class MainClass 
{
	public static void main(String[] args) 
	{
		MyQueue m1=new MyQueue(5);
		m1.add(10);
		m1.add(20);
		m1.add(30);
		m1.add(40);
		m1.add(50);
		System.out.println(m1);
		System.out.println("-----------------------------");
		m1.poll();
		System.out.println(m1);
	}

}
