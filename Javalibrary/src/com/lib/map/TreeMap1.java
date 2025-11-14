package com.lib.map;

import java.util.*;

class student implements Comparable<student>
{
	String name;
	String branch;
	int id;
	public student(String name, String branch, int id) {
		super();
		this.name = name;
		this.branch = branch;
		this.id = id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", branch=" + branch + ", id=" + id + "]";
	}
	@Override
	public int compareTo(student o)
	{
		return o.name.compareTo(this.name);
	}

}
public class TreeMap1 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> t1=new TreeMap<String ,Integer>();
		t1.put("j2ee", 01);
		t1.put("java", 02);
		t1.put("sql", 03);
		t1.put("hibernate", 05);
		t1.put("programing", 06);
		Set<String> s=t1.keySet();
		for(String s1:s)
		{
			System.out.println(s1+" = "+t1.get(s1));
		}
		System.out.println("--------customized object-------");
		student s1=new student("ganesh", "cse", 01);
		student s2=new student("phani", "bsc", 02);
		student s3=new student("vamsi", "mca", 03);
		student s4=new student("praneeth", "civil", 04);
		student s5=new student("ram", "cse", 05);
		TreeMap<student, Integer> t2= new TreeMap<student, Integer>();
		t2.put(s5, 1);
		t2.put(s4, 2);
		t2.put(s3, 3);
		t2.put(s4, 4);
		t2.put(s2, 5);
		t2.put(s1, 6);
		
		Set<student> keys=t2.keySet();
		for(student key:keys)
		{
			System.out.println(key+" = "+t2.get(key));
		}
		System.out.println("--------------------------");
		TreeMap<Integer,student> t3= new TreeMap<Integer,student>();
		t3.put(1,s5);
		t3.put(3,s4);
		t3.put(2,s3);
		t3.put(5,s2);
		t3.put(4,s1);
		t3.put(6,s2);
		Set<Integer> k=t3.keySet();
		for(Integer key:k)
		{
			System.out.println(key+" = "+t3.get(key));
		}
	}

}
