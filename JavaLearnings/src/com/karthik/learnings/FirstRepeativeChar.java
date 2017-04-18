package com.karthik.learnings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeativeChar {

	public static void main(String args[]) {
		String str = new String("stressetest");
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
				break;
			}
		}
	}
}
