package com.karthik.learnings;

import java.util.ArrayList;
import java.util.List;

public class ListDuplicateObject {
	public static void main(String args[]){
		Emp e1 = new Emp();
		e1.setName("A");
		Emp e2 = new Emp();
		e2.setName("B");
		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		Emp e3= list.get(0);
		e3.setDept("Dept");
		e3.setName("C");
		list.add(e3);
		System.out.println(e1==e3);
		System.out.println(list.size());
	}

}


class Emp{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	String name;
	String dept;
}