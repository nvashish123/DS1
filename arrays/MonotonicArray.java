package arrays;

import java.util.Arrays;

public class MonotonicArray {

	public static void main(String[] args) {

		int[] array = { -1, -5, -10, -1100, -1101, -1100, -9001 };
		System.out.println(isMonotonicShort(array));
	}

	
	
	public static boolean isMonotonicShort(int[] array) {
		
		boolean isNonIncreasing = true;
		boolean isNonDecreasing = true;
		
		
		
		// if elements are equal, that iteration will not go into any of the
		// if condition and the trend will remain same as previous
		
		for(int i=1;i<array.length;i++) {
			if(array[i] > array[i-1]) { // its increasing, so nonIncreasing is false
				isNonIncreasing = false;
			}
			else if(array[i] < array[i-1]) { // its decreasing, so nonDecreasing is false
				isNonDecreasing = false;
			}
		}
		return isNonDecreasing || isNonIncreasing;
	}
	
	
	public static boolean isMonotonic(int[] array) {

		// any empty array or array with 1 element is always monotonic
		if (array.length < 2) {
			return true;
		}

		boolean isMonotonic = true;

		String initialTrend = "decreasing";
		String currentTrend = "";

		if (array[0] == array[1]) {
			initialTrend = "unknown";
		}

		if (array[0] < array[1]) {
			initialTrend = "increasing";

		}

		if (array[0] > array[1]) {
			initialTrend = "decreasing";

		}

		for (int i = 1; i < array.length - 1; i++) {

			if (array[i + 1] - array[i] == 0) {
				continue;

			}

			if (array[i + 1] - array[i] > 0) {
				if(initialTrend == "unknown") {
					initialTrend = "increasing";
				}
				currentTrend = "increasing";

			} else {
				if(initialTrend == "unknown") {
					initialTrend = "decreasing";
				}
				currentTrend = "decreasing";

			}

			if (initialTrend.equals(currentTrend)) {
				isMonotonic = true;
				continue;
			} else {
				return false;
			}

		}

		return isMonotonic;

	}

}
