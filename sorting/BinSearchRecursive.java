package sorting;

import java.util.Random;

public class BinSearchRecursive {
	
	private static Integer[] data;

	/**
	 * We can create an OrderedArray which can hold data upto this size
	 * 
	 * @param size
	 */
	public BinSearchRecursive(int size) {
		this.data = new Integer[size];
	}

	public BinSearchRecursive() {
		this(100); // default size of the array is 100.
	}

	public static void main(String[] args) {
		BinSearchRecursive oa = new BinSearchRecursive(10);
		Random generator = new Random();
		for(int i=0;i<data.length;i++)
		{
			data[i] = i;
		}
		System.out.println(oa);
		System.out.println(oa.binarySearch(3,0,9));
		System.out.println(oa);

	}
	
	public int binarySearch(int toFind, int start, int end)
	{
		
		int indexToLook = (int) Math.floor((start + end) / 2);
		
		if (start == end) {
			if (data[indexToLook] == toFind)
				return start;
			return -1;
		}
		
		
		
		if(data[indexToLook] == toFind)
		{
			return indexToLook;
		}
		
		if(data[indexToLook] > toFind)
		{
			binarySearch(toFind, start, indexToLook-1);
		}
		return binarySearch(toFind, indexToLook+1, end);
		
		
	}
	
	
	
	

}
