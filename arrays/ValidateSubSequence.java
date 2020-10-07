package arrays;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubSequence {

	public static void main(String[] args) {
		
		List<Integer> sequence = new ArrayList<Integer>();
		
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(-1);
		
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		
		
		
		
		boolean result = isValidSubsequenceArrayWhileLoop(array, sequence);
		System.out.println(result);

	}
	
	
	
	/*
	 * This solution converts List to Array and iterates through both the arrays
	 * so, o(n^2) time complexity
	 * o(1) space complexity
	 */
	 public static boolean isValidSubsequenceArrayForLoop(List<Integer> arrayL, List<Integer> sequenceL) {
		    // Write your code here.
		 
		 
		 if(sequenceL.size() > arrayL.size())
		 {
			 return false;
		 }
		 
		 Integer[] array = new Integer[arrayL.size()];
		 array = (Integer[])arrayL.toArray(array);
		 
		 Integer[] sequence = new Integer[sequenceL.size()];
		 sequence = (Integer[])sequenceL.toArray(sequence);
		 
		 
		 
		 int seqIndex = 0;
		 
		for(int i=0;i<array.length;i++) {
			for( int j=seqIndex; j<sequence.length;j++) {
				
				if (sequence[j] == array[i])
				{
					seqIndex++;
					break;
				}
				
			}
			
			
		}
		 
		    return sequence.length == seqIndex;
		  }
	 
	 
	 
	 public static boolean isValidSubsequenceArrayWhileLoop(List<Integer> arrayL, List<Integer> sequenceL) {
		    // Write your code here.
		 
		 
		 if(sequenceL.size() > arrayL.size())
		 {
			 return false;
		 }
		 
		 Integer[] array = new Integer[arrayL.size()];
		 array = (Integer[])arrayL.toArray(array);
		 
		 Integer[] sequence = new Integer[sequenceL.size()];
		 sequence = (Integer[])sequenceL.toArray(sequence);
		 
		 
		 int arrayIndex = 0;
		 int seqIndex = 0;
		 
		while(array.length>arrayIndex && sequence.length>seqIndex)
		{
			if(array[arrayIndex] == sequence[seqIndex])
			{
				seqIndex++;
			}
			arrayIndex++;
		}
		 return sequence.length == seqIndex;
		 
		  }
	 
	 
	 
	 
	 /*
	  * This solution just iterates through the List once
	  * so, o(n) time complexity
	  */
	 public static boolean isValidSubsequence_List(List<Integer> array, List<Integer> sequence) {
	 
		 
		 int seqInx = 0;
		 
		 for (var value : array) {
			if(sequence.size() == seqInx)
			{
				break;
			}
			
			if(sequence.get(seqInx) == value)
			{
				seqInx++;
			}
			
		}
		 return seqInx == sequence.size();
		 
		
	 }
	 
	 

}
