package basics;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci ob = new Fibonacci();
		ob.fibWithoutArray(10);
		ob.fibWithArray(10);
		System.out.println("");
		System.out.println("Fibanocci with recurssion");
		for (int counter = 0; counter < 10; counter++){
	         System.out.print(" "+ob.fibWithRecursion(counter));
	      }
		

	}
	
	public void fibWithArray(int n)
	{
		System.out.println("");
		System.out.println("Fibonacci with array");
		
		int[] fib = new int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		System.out.print(fib[0]);
		System.out.print(" "+fib[1]);
		
		for(int i=2;i<fib.length;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
			System.out.print(" "+fib[i]);
		}
	}
	
	public void fibWithoutArray(int n)
	{
		
		System.out.println("Fibonacci without array");
		int a = 0;
		int b = 1;
		System.out.print(a);
		System.out.print(" "+b);
		int c = 1;
		for(int i=2;i<n;i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
	}
	
	public int fibWithRecursion(int n)
	{
		if (n < 2) return n;

	    return fibWithRecursion(n - 1) + fibWithRecursion(n - 2);
		
	}
}
