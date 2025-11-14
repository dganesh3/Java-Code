package com.lib.collections1;

import java.util.Comparator;
import java.util.TreeSet;

class me implements Comparator<me> {
	String work;
	String type;
	int sal;
	private Object name;

	@Override
	public String toString() {
		return "me [work=" + work + ", type=" + type + ", sal=" + sal + "]";
	}

	public me(String work, String type, int sal) {
		super();
		this.work = work;
		this.type = type;
		this.sal = sal;
	}

	@Override
	public int compare(me o1, me o2) {
		// return o2.sal-o1.sal;
		// return o2.type.length()-o1.type.length();
		return o1.work.compareTo(o2.work);
	}

}

public class treeset {
	public static void main(String[] args) {
		me m1 = new me("PHANI", "BEWARS", 0);
		me m2 = new me("RAJ", "ARMY", 9000);
		me m3 = new me("GANI", "AIR FORCE", 2000000);
		TreeSet<me> t1 = new TreeSet<me>(m1);
		t1.add(m1);
		t1.add(m3);
		t1.add(m2);
		t1.forEach(g -> System.out.println(g));
	}
}
