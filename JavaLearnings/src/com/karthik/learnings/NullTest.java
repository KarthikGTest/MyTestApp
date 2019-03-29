package com.karthik.learnings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class NullTest {
	public static void main(String args[]) {

		HashSet a = new HashSet();
		a.add(null);
		a.add(null);
		System.out.println(a.size());

		ArrayList b = new ArrayList();
		b.add(null);
		b.add(null);
		System.out.println(b.size());

		LinkedList l = new LinkedList();
		l.add(null);
		l.add(null);
		System.out.println(l.size());

		PriorityQueue p = new PriorityQueue();
		p.add(null);
		p.add(true);
		System.out.println(p.size());
	}
}
