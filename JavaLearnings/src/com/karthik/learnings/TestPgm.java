package com.karthik.learnings;

public class TestPgm {

	public static void main(String args[]) {

		int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int rows = arr.length;

		for (int i = 0; i < rows; i++) {
			int column = arr[i].length;
			for (int j = 0; j < column; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
	
}
