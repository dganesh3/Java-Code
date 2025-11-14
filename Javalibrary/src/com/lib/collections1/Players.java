package com.lib.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Team implements Comparator<Team>
{
	String name;
	int age;
	public Team(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compare(Team o1, Team o2) {
		
		//return o2.name.length()-o1.name.length();
		return o1.name.compareTo(o2.name);
	}
	
}

public class Players
{
	
	public static void main(String[] args) {
		Team t1 = new Team("Dravid",42);
		Team t2 = new Team("Dhoni",43);
		Team t3 = new Team("Virat",31);
		
		ArrayList<Team> alist = new ArrayList<Team>();
		alist.add(t1);
		alist.add(t2);
		alist.add(t3);
		
		
//		java.util.Iterator<Team> li=alist.iterator();
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
		
		alist.forEach(obj -> System.out.println(obj));
		System.out.println("===========Sorted List==========");
		
		Collections.sort(alist, t1);
		
		alist.forEach(obj -> System.out.println(obj));
		
		System.out.println("============================");
			
	}
	
	
}