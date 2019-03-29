package com.karthik.learnings;

public class StaticInheritanceTest {
	public static void main(String args[]) {

		StaticBaseClass sb = new StaticDerivedClass();
		System.out.println(sb.str);
		sb.print();
	}
}

class StaticBaseClass {
	static String str = "StaticBaseVariable";

	static void print() {
		System.out.println("StaticBaseMethod");
	}
}

class StaticDerivedClass extends StaticBaseClass {
	static String str = "StaticDerivedVariable";

	static void print() {
		System.out.println("StaticDerivedMethod");
	}
}
