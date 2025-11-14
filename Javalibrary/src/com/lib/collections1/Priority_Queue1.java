package com.lib.collections1;

import java.util.*;
class User implements Comparator<User>
{
	String name;
	String userid;
	public User(String name, String userid) 
	{
		super();
		this.name = name;
		this.userid = userid;
	}
	
	public String toString() {
		return "name :"+name+", userid :"+userid;
	}

	@Override
	public int compare(User o1, User o2) {
		
		return o1.name.compareTo(o2.name);
	}
}
class Player implements Comparable<Player>
{
	String Name;
	String Team;
	public Player(String name, String team) 
	{
		super();
		Name = name;
		Team = team;
	}
	@Override
	public String toString() {
		return "Player [Name=" + Name + ", Team=" + Team + "]";
	}
	
	
	@Override
	public int compareTo(Player o) 
	{
		
		return this.Name.compareTo(o.Name);
	}
}
public class Priority_Queue1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(10);
		p1.add(1);
		p1.add(15);
		p1.add(40);
		p1.add(50);
		p1.add(10);
		System.out.println(p1);
		while(p1.size()!=0)
		{
			System.out.println(p1.poll());
			
		}
		System.out.println("----------customized object----------");
		User u1=new User("ram","a1");
		User u2=new User("charan","a2");
		User u3=new User("tej","a3");
		PriorityQueue<User> p2=new PriorityQueue<User>(u1);
		p2.add(u3);
		p2.add(u2);
		p2.add(u1);
		while(p2.size()!=0)
		{
			System.out.println(p2.poll());
		}
		System.out.println("-------user defined object--------");
		Player pr1=new Player("MS DHoni","Csk");
		Player pr2=new Player("Raina","Csk");
		Player pr3=new Player("Virat","Rcb");
		Player pr4=new Player("Rohit","Mi");
		PriorityQueue<Player> p3=new PriorityQueue<Player>();
		p3.add(pr4);
		p3.add(pr3);
		p3.add(pr2);
		p3.add(pr1);
		while(p3.size()!=0)
		{
			System.out.println(p3.poll());
		}
	}

}
