package basics;

public class FibonacciNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<10;i++)
//		{
//		System.out.println(fibRecursive(i));
//		}
		
	//	fibWithArrays(10);
		fibWithoutArrays(10);
		
	}
	
	public static int fibRecursive(int n) {
	
		if(n<2)
		{
			return n;
		}
		
		return fibRecursive(n-1) + fibRecursive(n-2);
		
	}
	
	public static void fibWithArrays(int n)
	{
		int arr[] = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for (int i=2;i<arr.length;i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println(arr[i]);
		}
	}
	
	public static void fibWithoutArrays(int n) {
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		int sum = 1;
		
		for (int i=2;i<n;i++) {
			b = a;
			a = sum;
			sum = a+b;
			System.out.println(sum);
		}
		
		
	}

}
