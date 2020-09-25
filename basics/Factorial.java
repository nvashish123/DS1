package basics;

public class Factorial {

	public static void main(String[] args) {
		
System.out.println(getFactorial(5));
System.out.println(getFactorialItrative(5));

	}
	
	public static int getFactorial(int n)
	{
		if( n == 0)
		{
			return 1;
		}
		else
		{
			return n * getFactorial(n-1);
		}
	}
	
	public static int getFactorialItrative(int n)
	{
		int factorial = 1;
		for(int i=2;i<=n;i++)
		{
			factorial = factorial * i;
		}
		return factorial;
	}

}
