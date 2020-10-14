package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveElementToEnd {

	public static void main(String[] args) {
		
		
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(7);
		list.add(0);
		list.add(5);
		list.add(5);
		
		int toMove = 7;
		
		List<Integer> result = moveElementToEndNotInPlace(list, toMove);
		
		for (Integer integer : result) {
			System.out.print(integer);
		}
		

	}
	
	/*
	 * one iteration of the array, so o(n) time complexity
	 * in place swapping in the array, so constant space complexity
	 */
	public static List<Integer> moveElementToEnd(List<Integer> arrayL, int toMove) {
		
		
		int[] array = arrayL.stream().mapToInt(Integer::intValue).toArray();
		// compare each pair, if the toMove number is present on the left, swap
		
		int rightPointer = array.length-1;
		int i=0;
		
		while(i<rightPointer) {
			while(i<rightPointer && array[rightPointer] == toMove) {
				rightPointer--;
			}
			if(array[i] == toMove)
			{
				// swap array[i] and array[rightPointer]
				
				int temp = array[i];
		        array[i] = array[rightPointer];
				array[rightPointer] = temp;
				
			}
			i++;
		}
		
		return Arrays.stream(array).boxed().collect(Collectors.toList());
		//return Arrays.asList(array);
		//return array;
		
		
	    // This below solution works fine if the target element is present only once
		// in the array. If more than one, then it leaves one of them in place
		// which will eventually be left out in the middle
		
//		int rightPointer = array.length-1;
//		
//		for(int i=0;i<array.length;i++) {
//			if(array[i] == toMove && i<=rightPointer)
//			{
//				// swap array[i] with the array[rightPointer] 
//				//and move rightPoointer to the left
//				
//				int temp = array[i];
//				array[i] = array[rightPointer];
//				array[rightPointer] = temp;
//				rightPointer--;
//			}
//			
//		}
//		       return array;
		
	    
	  }

	
	/*
	 * one iteration of the array, so o(n) time complexity
	 * copying the array to new, so o(n) space complexity
	 */
	public static List<Integer> moveElementToEndNotInPlace(List<Integer> arrayL, int toMove) {
		
		int[] array = arrayL.stream().mapToInt(Integer::intValue).toArray();
		
		int[] resultArray = new int[array.length];
		
		
	// now just traverse the first array and keep two pointers in the resultSArray
	// leftPointer and rightPointer. If the element in the actual array is equal to
	// the targetNumber, then copy it to the rightPointer position in the
	// resultArray and decrease the pointer. If its not, then copy it to the left pointer.
	// and increase the leftpointer	
		
		
		int leftPointer = 0;
		int rightPointer = resultArray.length-1;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == toMove)
			{
				resultArray[rightPointer] = array[i];
				rightPointer--;
				
			}
			else {
				resultArray[leftPointer] = array[i];
				leftPointer++;
			}
		}
		
		return Arrays.stream(resultArray).boxed().collect(Collectors.toList());
	}
	
}
