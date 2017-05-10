package com.karthik.learnings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.omg.Messaging.SyncScopeHelper;

public class IteratorListIterator {
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		

		
		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println(str);
			if(str.equals("c")){
				iter.remove();
				iter.add("f");
			}
		}
		
		System.out.println("--------------------");
		
		list.forEach(alpha -> System.out.println(alpha));
		
		Iterator<String> iter1 = list.iterator();
		while(iter1.hasNext()){
			String str = iter1.next();
			System.out.println(str);
			if(str.equals("d")){
				
			}
		}
		
	}

}
