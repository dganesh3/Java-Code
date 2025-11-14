package com.lib.threads;

public class Methods extends Thread
{
	public static void main(String[] args) 
	{
		Methods m1=new Methods();
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getPriority());
		m1.setName("Mythread");
		System.out.println(m1.getName());
		m1.setPriority(MAX_PRIORITY);
		System.out.println(m1.getPriority());
		m1.setPriority(MIN_PRIORITY);
		System.out.println(m1.getPriority());
		m1.setPriority(NORM_PRIORITY);
		System.out.println(m1.getPriority());
		System.out.println(m1.getState());
		m1.start();
		System.out.println(m1.getState());
		try {
			m1.wait();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(m1.getState());
	}

}
