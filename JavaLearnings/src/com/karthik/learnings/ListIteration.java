package com.karthik.learnings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {
	
	public static void main(String args[]){
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		int i=0;
		for(Iterator<String> it=list.iterator();it.hasNext();i++){
			System.out.println(list.get(i));
		}
				
	}

}
