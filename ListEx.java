package com.cts.collections;

import java.util.ArrayList;

//Collections
//1)lots of utility methods
//2)not fixed in size/growable in nature   AL->10-->16->(cc*3/2)+1
//3)both homogeneous and heterogeneous object can store

//List
//4)duplicates are allowed
//5)insertion order is preserved
//java.util

public class ListEx {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();// 10
		names.add("suresh");
		names.add("naresh");
		names.add(123);
		names.add(true);
		names.add(23.45);
		names.add("rajesh");
		names.add("akash");
		names.add("mahesh");
		names.add("suresh");
		names.add("somesh");
		names.add(1, "kumar");
		System.out.println(names);
		
//		for(String name:names)
//		{
//			if(name.endsWith("esh"))
//			{
//				System.out.println(name);
//			}
//		}
		
		
		
		
		
		
		
//		ArrayList<String> names1 = new ArrayList<String>();// 10
//		names1.add("crishtoper");
//		names1.add("ravi");
//		System.out.println(names1);
//		names1.addAll(names);
//		System.out.println(names1);
//		System.out.println(names1.contains("sandeep"));
//		System.out.println(names1.containsAll(names));
//		names1.remove("kumar");
//		System.out.println(names1);
//		System.out.println(names1.get(0));
//		names1.retainAll(names);
//		//names1.removeAll(names);
//		System.out.println(names1);
		
		
		
	}
}
