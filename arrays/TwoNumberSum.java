package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class TwoNumberSum {

	public static void main(String[] args) {
		int array[] = {3,5,-4,2,11,2,-1,6};
		int targetSum = 10;
		int result[] = twoNumberSum_nlogn(array, targetSum);
		if(result.length>0) {
		System.out.println(result[0]+","+result[1]);
		}
		else {
			System.out.println("No two numbers add up to the target sum");
		}

	}

	/* o(n^2) runtime complexity due to two for loops iterations
	 * o(1) space complexity as we are not creating any additional storage
	 * 
	 */
	public static int[] twoNumberSum_n2(int[] array, int targetSum) {
	    // Write your code here.
			
			for(int i=0;i<=array.length-1;i++) {
				for (int j=i+1;j<array.length;j++) {
					if(array[i] + array[j] == targetSum)
					{
						return new int[]{array[i], array[j]};
					}
				}
			}
			
	    return new int[0];
	  }
	
	
	/* o(n) runtime complexity due to one for loop iterations, Set items lookup will be a constant time operation
	 * o(n) space complexity, as we are creating a new Set from the array elements
	 * 
	 */
	public static int[] twoNumberSum_n(int[] array, int targetSum) {
	    // Write your code here.
		
		Set<Integer> nums = new HashSet<Integer>();	
		
			for(int i=0;i<=array.length-1;i++) {
				
				int secondItem = targetSum - array[i];
				 if(nums.contains(secondItem))
				 {
					 return new int[]{array[i], secondItem};
				 }
				 else {
					 nums.add(array[i]);
				 }
				
				
			}
			
	    return new int[0];
	  }
	
	
	/* o(nlogn) runtime complexity due to the array sorting plus one iteration, so nlogn + n
	 * o(n) space complexity, as we are creating a new Set from the array elements
	 * 
	 */
	public static int[] twoNumberSum_nlogn(int[] array, int targetSum) {
	    // Write your code here.
		
		Arrays.sort(array);
		int left = 0;
		int right = array.length-1;
		
		while(left<right)
		{
			if(array[left] + array[right] == targetSum)
			{
				return new int[] {array[left], array[right]};
			}
			else if(array[left] + array[right] > targetSum)	
			{
				right--;
			}
			else {
				left++;
			}
				
			}
			
	    return new int[0];
	  }
	
	
}
