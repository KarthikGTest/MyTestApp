package com.karthik.learnings;

import java.util.ArrayList;
import java.util.List;

public class IterateListWithLamda {
	
	public static void main(String args[]){
		
		List<String> names=new ArrayList<String>();
		names.add("Test1");
		names.add("Test2");
		names.add("Test3");
		
		names.forEach(name -> System.out.println(name));
	}

}
