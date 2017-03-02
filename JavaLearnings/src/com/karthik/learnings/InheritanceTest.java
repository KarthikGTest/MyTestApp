package com.karthik.learnings;

public class InheritanceTest {

	public static void main(String args[]){
		BaseClass.print();
		SubClass.print();
	}
	
}

class BaseClass{
	static void print(){
		System.out.println("Base");
	}
}
class SubClass{
	static void print(){
		System.out.println("Sub");
	}
}
