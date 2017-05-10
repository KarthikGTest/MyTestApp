package com.karthik.learnings;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

	public static void main(String args[]){
		
		List<String> list = getAlphaList();
		for(int i=1;i<=13;i++){
			list.remove(i);
		}
		
		for(String s:list){
			System.out.println(s);
		}
	
		
		
		

		
	}
	
	private static List<String> getAlphaList(){
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		list.add("L");
		list.add("M");
		list.add("N");
		list.add("O");
		list.add("P");
		list.add("Q");
		list.add("R");
		list.add("S");
		list.add("T");
		list.add("U");
		list.add("V");
		list.add("W");
		list.add("X");
		list.add("Y");
		list.add("Z");
		
		return list;
	}
	
}
