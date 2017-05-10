package com.karthik.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringTest {
	
	public static void main(String args[]){
		
		
		System.out.println(1+2+"AZ");
		System.out.println("AZ"+1+2);
		
		System.out.println("-------------------------------------");
		
		int a=0;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++ + ++a);
		System.out.println(++a + a++);
		System.out.println(a);
		
		System.out.println("-------------------------------------");
		
		String toList = "This is a test string";
		List<String> list=Arrays.asList(toList.split("\\s"));
		for(String s:list){
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------");
		
		// Remove duplicate from String with Set
		String str= "PASSIONOTE";
		// Order not maintained
		System.out.println(removeDupWithHashSet(str)); 
		System.out.println(removeDupWithHashMap(str));
		
		// Order maintained
		System.out.println(removeDupWithLinkedHashSet(str)); 
		System.out.println(removeDupWithLinkedHashMap(str));
		
		System.out.println("-------------------------------------");
		
		
		String s1="test";
		String s2="test";
		String s3= new String("test");
		String s4= new String("test");
		StringBuffer s5= new StringBuffer("test");
		StringBuilder s6=new StringBuilder("test");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		//System.out.println(s5==s6);
		
		
		System.out.println("-------------------------------------");
		String n1=null;
		String n2=null;
		// This will print just FALSE
		System.out.println("This will print just FALSE");
		System.out.println("n1==n2 is "+  n1==n2);
		
		System.out.println("-------------------------------------");
		
		String charlist = "a,s,d,f,1,2,f,e,4,g,j,u,3,2";
		
		List<String> parsedList = Arrays.asList(charlist.split(","));
		List<Integer> numList = new ArrayList<Integer>();
		List<Character> charList = new ArrayList<Character>();
		for(String st:parsedList){
			
			if(st.length()==1){
				Character c = (Character)st.charAt(0);
				System.out.println(c);
				if(c>='0' && c<='9'){
					numList.add(Character.getNumericValue(c));
				}else{
					charList.add(c);
				}
			}else{
				System.out.println("Has multiple chars");
			}
		}
		
		Collections.sort(numList);
		System.out.println(numList);
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println(numList);
		
		
	}

	private static String removeDupWithHashSet(String str) {
		
		Set<Character> hashSet = new HashSet<Character>();
		for(char c:str.toCharArray()){
			hashSet.add(c);
		}
		
		Iterator<Character> setIterator = hashSet.iterator();
		String returnStr="";
		while(setIterator.hasNext()){
			returnStr=returnStr+setIterator.next().toString();
		}

		return returnStr;
		
	}

	private static String removeDupWithLinkedHashSet(String str) {
		
		Set<Character> hashSet = new LinkedHashSet<Character>();
		for(char c:str.toCharArray()){
			hashSet.add(c);
		}
		
		Iterator<Character> setIterator = hashSet.iterator();
		String returnStr="";
		while(setIterator.hasNext()){
			returnStr=returnStr+setIterator.next().toString();
		}

		return returnStr;
		
	}

	private static String removeDupWithHashMap(String str) {
		
		Map<Character,Character> hashMap = new HashMap<Character,Character>();
		for(char c:str.toCharArray()){
			hashMap.put(c,c);
		}
		
		String returnStr="";
		
		Map<Character, Character> newMap = new HashMap();
		
		for(Map.Entry<Character, Character> entry:hashMap.entrySet()){
			returnStr = returnStr+entry.getValue();
		}

		return returnStr;
		
	}

	private static String removeDupWithLinkedHashMap(String str) {
		
		Map<Character,Character> hashMap = new LinkedHashMap<Character,Character>();
		for(char c:str.toCharArray()){
			hashMap.put(c,c);
		}
		
		String returnStr="";
		
		
		for(Map.Entry<Character, Character> entry:hashMap.entrySet()){
			returnStr = returnStr+entry.getValue();
		}

		return returnStr;
		
	}
}
