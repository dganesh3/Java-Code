package com.lib.examplesof_collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Vector;

class nani1 implements Comparator<nani1>
{
	String name;
	int age;
	
	public nani1(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "treeee [name="+name+",age="+age+"]";
	}

	@Override
	public int compare(nani1 o1, nani1 o2)
	{
		return o2.age-o1.age;
	}
}
public class treeee {
    public static void main(String[] args) 
    {
    	nani1 n1=new nani1("amm",423);
    	nani1 n3=new nani1("vsm",123);
    	nani1 n2=new nani1("zxm",323);
    	nani1 n4=new nani1("bc",23);
    	LinkedHashSet<nani1>t1=new LinkedHashSet<nani1>();
		  t1.add(n1);
		  t1.add(n2);
		  t1.add(n4);
		  t1.add(n1);
		  t1.add(n3);
		 // System.out.println(t1);
		  Vector<nani1>v1=new Vector<nani1>(t1);
		  Collections.sort(v1,new nani1("abc",12));
		  v1.forEach(x -> System.out.println(x));
		  //Collections.sort(v1,);
	}

	
}