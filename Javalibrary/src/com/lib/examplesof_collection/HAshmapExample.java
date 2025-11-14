package com.lib.examplesof_collection;

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
		
		return o1.place.compareTo(o2.place);
		// return o2.distance-o1.distance;
	}
}
public class HAshmapExample 
{
    public static void main(String[] args) {
		Tourism t1=new Tourism("haveli",23);
		Tourism t2=new Tourism("taj",26);
		Tourism t3=new Tourism("char",13);
//		PriorityQueue<Tourism> b1=new  PriorityQueue<Tourism>(t1);
//		b1.add(t1);
//		b1.add(t3);
//		b1.add(t2);
//	    while(b1.size()!=0)
//	    {
//	    	System.out.println(b1.poll());
//	    }
		HashMap<Tourism, Integer> h1=new HashMap<Tourism, Integer>();
		h1.put(t1, 1);
		h1.put(t2, 2);
		h1.put(t3, 3);
		h1.put(t2, 4);
		
	//	System.out.println(h1);
		Set<Tourism> s=h1.keySet();
		for(Tourism t:s)
		{
			System.out.println(t+" = "+h1.get(t));
		}

	}
}