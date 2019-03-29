package com.karthik.learnings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIter {
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		Iterator<String> iter = list.iterator();
		list.add("c");
		list.add("d");
		while(iter.hasNext()){
			System.out.println(iter.next() + " ");
		}
		
		
	}

}
