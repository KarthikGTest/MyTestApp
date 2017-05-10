package com.karthik.learnings;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String args[]){
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(3);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	

}
