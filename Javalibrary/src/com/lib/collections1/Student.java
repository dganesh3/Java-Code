package com.lib.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

class StudentDet implements Comparable<StudentDet>
{
	String name;
	int marks;
	public StudentDet(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDet [name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(StudentDet o1) {
//		return this.name.compareTo(o1.name);
		return this.marks-o1.marks;
	}
	
	
}
public class Student 
{
	public static void main(String[] args) {
		
		StudentDet s1 = new StudentDet("phani",78);
		StudentDet s2 = new StudentDet("naidu",59);
		StudentDet s3 = new StudentDet("charan",97);
		StudentDet s4 = new StudentDet("ram",81);
		
		ArrayList<StudentDet> al = new ArrayList<StudentDet>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		al.forEach(obj -> System.out.println(obj));
		
		Collections.sort(al);
		
		System.out.println("-----According to name-----");
		
		al.forEach(obj -> System.out.println(obj));		
		Vector<StudentDet> v = new Vector<StudentDet>(al);
		
//		System.out.println("=========Vector===========");
//	
//		v.forEach(obj -> System.out.println(obj));
//		HashSet<StudentDet> hs = new HashSet<StudentDet>(al);
//		
//		System.out.println("=========HashSet===========");
//		
//		hs.forEach(obj -> System.out.println(obj));
//		
		
		
	}
}
