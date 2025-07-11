package com.cts.stringex;

public class StringEx {

	public static void main(String[] args) {

		// String-->group of chars "" -->immutable
		// StringBuffer,StringBuilder -->mutable java.lang

		// String literal
		// new keyword

		String orgName = "cognizant";
		String orgName1 = "cognizant";

		String updatedValue = orgName.concat("india");

		System.out.println(orgName);
		System.out.println(updatedValue);

		System.out.println(orgName.equals(orgName1));// true
		System.out.println(orgName.compareToIgnoreCase(orgName1));// 0
		System.out.println(orgName == orgName1);// true
		// object.equals() ==

		// compareTo()
		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both objects are same

		String orgName2 = new String("cognizant");
		String orgName3 = new String("cognizant");
		System.out.println(orgName2.equals(orgName3));// true
		System.out.println(orgName2.compareToIgnoreCase(orgName3));// 0
		System.out.println(orgName2 == orgName3);// false

		StringBuffer sb = new StringBuffer("india");//muttable
		StringBuffer sb1 = new StringBuffer("india");
		sb.append(" hyderabad");

		System.out.println(sb);
		System.out.println(sb.equals(sb1));//false ==
		System.out.println(sb==sb1);
		
		
	}

}
