package com.lib.Arraylist;

import java.util.ArrayList;

public class ArrayList_Methods 
{
	public static void main(String[] args)
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(1);
		list.add("java");
		System.out.println("list = "+list);
		list.add(1,"hello");
		System.out.println("list = "+list);
		System.out.println("-----------------------------------------------");
		ArrayList<Object> list1=new ArrayList<Object>();
		list1.add(5);
		list1.add('z');
		System.out.println("list1 = "+list1);
		list1.addAll(list);
		System.out.println("list1 = "+list1);
		list1.addAll(1,list);
		System.out.println("list1 = "+list1);
		list1.remove(0);
		list1.remove("hello");
		System.out.println("list1 = "+list1);
//		list1.removeAll(list1);
	//	list1.clear();
		//System.out.println("list1 = "+list1);
		System.out.println(list1.contains("mobile"));
		System.out.println(list1.containsAll(list));
		
	}

}
