package com.karthik.learnings;

public class InheritanceTest {
	public static void main(String args[]) {

		BaseClass obj = new DerivedClass();
		System.out.println(obj.name);
		obj.print();
	}
}

class BaseClass {
	String name = "baseVariable";

	void print() {
		System.out.println("baseMethod");
	}
}

class DerivedClass extends BaseClass {
	String name = "derivedVariable";

	void print() {
		System.out.println("derivedMethod");
	}
}