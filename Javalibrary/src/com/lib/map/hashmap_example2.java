package com.lib.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
class Tourism implements Comparator<Tourism>
{
	String place;
	int distance;
	
	public Tourism(String place, int distance) {
		super();
		this.place = place;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Tourism [place=" + place + ", distance=" + distance + "]";
	}
	@Override
	public int compare(Tourism o1, Tourism o2) {
		
	//	return o2.place.compareTo(o1.place);
		return o2.distance-o1.distance;
	}
		
}
public class hashmap_example2 
{
	public static void main(String[] args) 
	{
		Tourism t1=new Tourism("tirupathi",250);
		Tourism t2=new Tourism("bangalore",200);
		Tourism t3=new Tourism("cubbon park",20);
		Tourism t4=new Tourism("lalbag",15);
		Tourism t5=new Tourism("mysur",150);
		Tourism t6=new Tourism("goa",500);
		HashMap<Tourism, Integer> h1=new HashMap<Tourism, Integer>();
		h1.put(t6, 1);
		h1.put(t4, 2);
		h1.put(t5, 3);
		h1.put(t2, 4);
		h1.put(t1, 5);
		h1.put(t3, 6);
		Set<Tourism> s=h1.keySet();
		for(Tourism t:s)
		{
			System.out.println(t+" = "+h1.get(t));
		}
		System.out.println("-------------------------------");
		HashMap<Integer,Tourism> h2=new HashMap<Integer,Tourism>();
		h2.put(1,t6);
		h2.put(2,t5);
		h2.put(4,t4);
		h2.put(3,t3);
		h2.put(5,t2);
		h2.put(6,t1);
		Set<Integer> s1=h2.keySet();
		for(Integer i1:s1)
		{
			System.out.println(i1+" = "+h2.get(i1));
		}
	
	}

}
