package com.cts.collections;

import java.util.Comparator;
import java.util.TreeSet;

//Collections
//1)lots of utility methods
//2)not fixed in size/growable in nature 
//3)both homogeneous and heterogeneous object can store

//List
//4)duplicates are not allowed
//5)insertion order is not preserved
//java.util

public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>(new MyOrder());// 10
		names.add("suresh");// "suresh".compareTo("naresh")
		names.add("naresh");
		names.add("rajesh");
		names.add("akash");
		names.add("mahesh");
		names.add("suresh");
		names.add("somesh");
		System.out.println(names);
		// Comparable(I) -->NSO-->java.lang-->compareTo()
		// Comparator(I) -->CSO-->java.util-->compare
		// SAM
		// Interface,FunctionalInterface,Marker Interface
	}
}
class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}