package arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// longest peak here is 0,10,6,5,-1,-3
		int[] array = { 1, 2, 3, 4, 5, 1 };
		int peakLength = longestPeak(array);
		System.out.println("Length of the longest peak = " + peakLength);

	}

	/*
	 * pretty much one iteration of each element, plus some overlap of iteration to
	 * the left hand side to find the length of the peaks, so total o(n) time
	 * complexity o(1) space complexity as we did not copy elements outside of the
	 * array and its basically in place traversal, with some pointer variables to
	 * store interim results
	 */

	public static int longestPeak(int[] array) {
		

		int longestPeakLength = 0;
		int i = 1;

		while (i < array.length - 1) {
			// if no peak found, continue traversing the array forward
			boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
			if (!isPeak) {
				i++;
				continue;
			} else {
				System.out.println("Peak found:" + array[i - 1] + "," + array[i] + "," + array[i + 1]);
			}

			// already covered i-1, so start from i-1 for the left traverse
			int leftIndex = i - 2;
			// already covered i+1, so start from i+2 for the right traverse
			int rightIndex = i + 2;

			System.out.println("elements left to the peak- ");
			while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
				System.out.println(array[leftIndex] + ",");
				leftIndex--;
			}

			System.out.println("elements right to the peak- ");
			while (rightIndex < array.length && array[rightIndex] < array[rightIndex - 1]) {
				System.out.println(array[rightIndex] + ",");
				rightIndex++;
			}

			int currentPeaklength = rightIndex - leftIndex - 1;

			if (currentPeaklength > longestPeakLength) {
				longestPeakLength = currentPeaklength;
			}

			// now we traverse forward from the right index we already traversed above
			i = rightIndex;
		}

		return longestPeakLength;
	}

}
