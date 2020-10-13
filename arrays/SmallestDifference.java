package arrays;

import java.util.Arrays;

public class SmallestDifference {

	public static void main(String[] args) {
		int[] array1 = {3,-1,5,20,10,28};
		int[] array2 = {15,134,135,26,17};
		int[] answer = smallestDifference(array1, array2);
		System.out.println(answer[0] + ","+ answer[1]);

	}
	
	
	
	
	/*
	 * o(nlog(n)) + o(mlog(m)) for sorting both the arrays
	 * pointer logic traverses each array at most once, so that will be o(n+m)
	 * so, effective time complexity will still be o(nlog(n)) + o(mlog(m))
	 */
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
	   
		
		int[] smallestPair = new int[2];
		
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		int idxOne = 0;
		int idxTwo = 0;
		
		int current = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		while(idxOne<arrayOne.length && idxTwo<arrayTwo.length) {
			
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];
			
		
			
				if(secondNum>firstNum) {
					current = secondNum - firstNum;
					idxOne++;
				}
				
				else if(secondNum<firstNum) {
					current = firstNum - secondNum;
					idxTwo++;
				}
				
				else {
					smallestPair[0] = firstNum;
					smallestPair[1] = secondNum;
					return smallestPair;
				}
				
				// superb trick to make the condition always true for the first time
				if(smallest>current) { 
					smallest = current;
					smallestPair[0] = firstNum;
					smallestPair[1] = secondNum;
					
				}
			
		}
		
		
	    return smallestPair;
	  }

}
