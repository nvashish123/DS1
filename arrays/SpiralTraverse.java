package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, 
						  { 5, 6, 7, 8 }, 
						  { 9, 10, 11, 12 }, 
						  { 13, 14, 15, 16 }

		};

		List<Integer> result = spiralTraverseReccursive(array);

		for (Integer integer : result) {
			System.out.println(integer);
		}

	}

	public static List<Integer> spiralTraverse(int[][] array) {

		if (array.length == 0)
			return new ArrayList<Integer>();

		List<Integer> result = new ArrayList<Integer>();

		int startRow = 0;
		int endRow = array.length - 1;
		int startCol = 0;
		int endCol = array[0].length - 1;

// iterate through this loop until all the inner rings are traversed
		
		while (startRow <= endRow && startCol <= endCol) {

			// loop through the first row, all columns

			for (int col = startCol; col <= endCol; col++) {
				result.add(array[startRow][col]);
			}

			// loop through the last column, all rows
			for (int row = startRow + 1; row <= endRow; row++) {
				result.add(array[row][endCol]);
			}

			// loop through the last row, all columns
			for (int col = endCol - 1; col >= startCol; col--) {
				if (startRow == endRow)
					break;
				result.add(array[endRow][col]);
			}

			// loop through the all rows, first column
			for (int row = endRow - 1; row > startRow; row--) {
				if (startCol == endCol)
					break;
				result.add(array[row][startCol]);
			}

			startRow++;
			startCol++;
			endRow--;
			endCol--;

		}

		// Write your code here.
		return result;
	}
	
	
	public static List<Integer> spiralTraverseReccursive(int[][] array) {
	
		if (array.length == 0)
			return new ArrayList<Integer>();

		List<Integer> result = new ArrayList<Integer>();
		
		spiralFill(array,0,array.length-1,0,array[0].length - 1,result);
		
		return result;
	}
	
	public static void spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol, List<Integer> result)
	{
		if(startRow > endRow || startCol > endCol) 
			return;
	
	
	for (int col = startCol; col <= endCol; col++) {
		result.add(array[startRow][col]);
	}

	// loop through the last column, all rows
	for (int row = startRow + 1; row <= endRow; row++) {
		result.add(array[row][endCol]);
	}

	// loop through the last row, all columns
	for (int col = endCol - 1; col >= startCol; col--) {
		if (startRow == endRow) break;
		result.add(array[endRow][col]);
	}

	// loop through the all rows, first column
	for (int row = endRow - 1; row > startRow; row--) {
		if (startCol == endCol) break;
		result.add(array[row][startCol]);
	}
	
	spiralFill(array,startRow+1, endRow-1, startCol+1, endCol-1,result);
	
	}

}
