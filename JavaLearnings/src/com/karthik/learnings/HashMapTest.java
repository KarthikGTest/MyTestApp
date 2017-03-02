package com.karthik.learnings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String args[]){
		
		String s= "1";
		
		Map map=new HashMap();
		map.put(s, "Value1");
		s="2";
		System.out.println(map.get(s));
		
		Set set= new HashSet();
		Map.Entry entry;
		}

}
