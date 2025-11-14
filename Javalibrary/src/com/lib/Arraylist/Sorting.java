package com.lib.Arraylist;

import java.util.*;

class customized implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
public class Sorting 
{
	public  static void main(String[] args) {
		customized c=new customized();
		ArrayList< Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(40);
		Collections.sort(al,c);
		//Collections.sort(al);
		System.out.println(al);
	}
}
