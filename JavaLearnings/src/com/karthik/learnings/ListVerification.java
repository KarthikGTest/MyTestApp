package com.karthik.learnings;

import java.util.ArrayList;
import java.util.List;

public class ListVerification {

	public static void main(String args[]){
		List<String> s = new ArrayList<String>();
		
		List<String> s1 = new ArrayList(s);
		List<String> s2 = new ArrayList(s);
		
		s.add("A");
		s1.add("B");
		s2.add("C");
		System.out.println(s2);
		System.out.println(s);
		System.out.println(s1);
	}
	
}
