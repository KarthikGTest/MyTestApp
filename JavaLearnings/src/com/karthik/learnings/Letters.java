package com.karthik.learnings;
/* Read input from STDIN. Print your output to STDOUT*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Letters 
{
    public static void main(String args[]) throws Exception
	{

		Scanner in = new Scanner(System.in);
		String input = in.nextLine().trim();

		if (Pattern.compile(".*[0-9].*").matcher(input).matches()) {
			System.out.println("INVALID");
		} else {
			input = input.toLowerCase();
			Map<Character, Integer> letterFrequency = new HashMap<>();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (!Character.isLetter(c))
					continue;
				if (letterFrequency.containsKey(c)) {
					int frequency = letterFrequency.get(c);
					letterFrequency.put(c, ++frequency);
				} else
					letterFrequency.put(c, 1);
			}
			List<Entry<Character, Integer>> letters = new ArrayList<>(letterFrequency.entrySet());
			Collections.sort(letters, new Comparator<Entry<Character, Integer>>() {
				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					Float diff = Math.signum(o2.getValue() - o1.getValue());
					if (o2.getValue() == o1.getValue()) {
						return o1.getKey() - o2.getKey();
					}
					return diff.intValue();
				}
			});
			for (int i = 0; i < letters.size(); i++) {
				System.out.print(letters.get(i).getKey() + " " + letters.get(i).getValue());
				if (i != letters.size() - 1) {
					System.out.print(";");
				}
			}

		}
	}
}