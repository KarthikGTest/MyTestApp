package com.karthik.learnings;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String args[]){
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person(101, "Amit"));
		set.add(new Person(102, "Sumit"));
		set.add(new Person(101, "Amit"));
		set.add(new Person(103, "Sumit"));
		System.out.println(set.size());
	}

}

class Person{
	private int id;
	private String name;
	Person(int i, String n){
		this.id = i;
		this.name= n;
	}
}
