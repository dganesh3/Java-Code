package com.lib.map;

import java.util.HashMap;
import java.util.Set;
class Team implements Comparable<Team>
{
	String team;
	String playername;
	String roll;
	public Team(String team, String playername, String roll) {
		super();
		this.team = team;
		this.playername = playername;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Team [team=" + team + ", playername=" + playername + ", roll=" + roll + "]";
	}
	@Override
	public int compareTo(Team t) {

		return this.team.compareTo(t.team);
	}

}

public class hashmapExample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(01, "java");
		h1.put(02, "sql");
		h1.put(05, "hibernate");
		h1.put(04, "programming");
		h1.put(03, "spring");
		h1.put(06, "apti");
		Set<Integer> s=h1.keySet();
		for(Integer i:s)
		{
			System.out.println(i+" = "+h1.get(i));
		}
		System.out.println("----------user-defined-object-----");
		Team t1=new Team("csk", "msdhoni", "wk-batsmen");
		Team t2=new Team("csk", "jadeja", "bowling-allrounder");
		Team t3=new Team("rcb", "virat-kohli", "batsmen");
		Team t4=new Team("rcb", "faf", "batsmen");
		Team t5=new Team("mi", "rohit", "batsmen");
		Team t6=new Team("mi", "bumrah", "bowler");
		HashMap<Team,Integer> h2=new HashMap<Team,Integer>();
		h2.put(t6,01);
		h2.put(t5,02);
		h2.put(t4,03);
		h2.put(t1,04);
		h2.put(t2,05);
		h2.put(t3,06);
		h2.put(t6,07);
		Set<Team> key=h2.keySet();
		for(Team t:key)
		{
			System.out.println(t+" = "+h2.get(t));
		}
		System.out.println("------pre-defined-with=user-defined-----");
		HashMap<Integer,Team> h3=new HashMap<Integer,Team>();
		h3.put(06,t6);
		h3.put(07,t5);
		h3.put(03,t4);
		h3.put(02,t3);
		h3.put(05,t2);
		h3.put(01,t1);
		h3.put(07,t6);
		Set<Integer> k=h3.keySet();
		for(Integer i1:k)
		{
			System.out.println(i1+" = "+h3.get(i1));
		}
	}

}
