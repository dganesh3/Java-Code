package org.jsp.example;

import java.util.ArrayList;
import java.util.Collections;

public class Check implements Comparable<String>
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("ganesh");
		a.add("Ramesh");
		a.add("Pavan");
		a.add("Suresh");
		a.add("Rajesh");
		Collections.sort(a);
		for(int i=0;i<=a.size()-1;i++)
		{
			String s=(String) a.get(i);
			String str=s.toUpperCase();
			System.out.println(str+" "+str.length());
		}
//		a.add(10);
//		a.add(20);
//		a.add(13.5);
//		a.add(12.5);
//		a.add(10);
//		int sum=0;
//		double d=0.0;
//		for (Object o:a)
//		{
//			if(o instanceof Integer)
//				sum=(int)o+sum;
//			if(o instanceof Double)
//				d=(double) o+d;
//		}
//		System.out.println(sum);
//		System.out.println(d);
//		
		
	}

	

	@Override
	public int compareTo(String s) {
		return s.compareTo(s);
	}

}
