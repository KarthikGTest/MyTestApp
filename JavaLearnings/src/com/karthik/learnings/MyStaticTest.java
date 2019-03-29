package com.karthik.learnings;

public class MyStaticTest {
public static void main(String args[]){
	Base obj = new Derived();
	obj.print();
	System.out.println(obj.a);
	

	Derived obj1 = new Derived();
	obj1.print();
	System.out.println(obj1.a);
}
}

class Base{
	static int a=10;
	public static void print(){
		System.out.println("Base");
	}
}
class Derived extends Base
{
	static int a=20;
	public static void print(){
		System.out.println("Derived");
	}
}
