package org.jsp.example;

import java.util.HashMap;
import java.util.HashSet;
class Book extends HashMap<Book,Integer>
{
	
}
public class MyThread extends Thread {
	HashSet<Integer> h = new HashSet<Integer>();

	public void run() {
		for (int i = 1; i <= 5; i++) {
			h.add(i);
			
		}
		System.out.println(h);
	}
	public static void main(String[] args) 
	{
		
		MyThread m1 = new MyThread();
		m1.start();

	}

}
