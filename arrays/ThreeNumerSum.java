package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {12, 3, 1, 2, -6, 5, 0, -8, -1};
		int targetSum = 0;
		List<Integer[]> result = threeNumberSum(array,targetSum);
		
		for (Integer[] integers : result) {
			for(int i=0;i<integers.length;i++) {
				System.out.print(Integer.toString(integers[i])+",");
			}
			System.out.println(" ");
		}

	}

	
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
	    // Write your code here.
		
		List<Integer[]> result = new ArrayList<Integer[]>();
		
		Arrays.sort(array);
		
		
		for(int i=0;i<array.length-2;i++)
		{
		
			int left = i+1;
			int right = array.length-1;
			
			
			while(left<right)
			{
				
				int currentTripletSum = array[i] + array[left] + array[right];
				
				
				if( currentTripletSum == targetSum)
				{
					result.add(new Integer[] {array[i],array[left],array[right]});
					left++;
					right--;
				}
				else if(currentTripletSum < targetSum)
				{
					left++;
				}
				else {
					right--;
				}
			}
			
			
		}
		
		
	    return result;
	  }
	
	
}
