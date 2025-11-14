package com.lib.collections1;

import java.util.*;
import java.util.LinkedList;
class customer implements Comparable<customer>
{
	String name;
	String order;
	int id;
	public customer(String name, String order, int id) 
	{
		super();
		this.name = name;
		this.order = order;
		this.id = id;
	}
	@Override
	public String toString() 
	{
		return "customer [name=" + name + ", order=" + order + ", id=" + id + "]";
	}
	@Override
	public int compareTo(customer o) 
	{
		
		return this.name.compareTo(o.name);
	}
	
	
}
public class Linkedlist1 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(5);
		l1.add(6);
		l1.add(5);
		l1.add(33);
		l1.add(1);
		System.out.println(l1);
		Collections.sort(l1);
		l1.forEach(obj -> System.out.println(obj));
		System.out.println("------------user defined-------");
		customer c1=new customer("uday", "biryani", 01);
		customer c2=new customer("phani", "pulav", 02);
		customer c3=new customer("ganesh", "chicken", 03);
		customer c4=new customer("ram", "mutton", 04);
		LinkedList<customer> l2=new LinkedList<customer>();
		l2.add(c4);
		l2.add(c1);
		l2.add(c3);
		l2.add(c2);
		l2.forEach(obj -> System.out.println(obj));
		System.out.println("--------after sorting-------");
		Collections.sort(l2);
		l2.forEach(obj -> System.out.println(obj));
	
		
		
		
		
		
	}

}
