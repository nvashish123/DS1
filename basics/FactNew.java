package basics;

public class FactNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calculateFactRecurrsive(5));
System.out.println(calculateFactIterative(5));
	}
	
	public static int calculateFactRecurrsive(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else {
			return n*calculateFactRecurrsive(n-1);
		}
	}
	
	public static int calculateFactIterative(int n)
	{
		
		if(n<=2)
		{
			return n;
		}
		int result = 1;
		for (int i=2;i<=n;i++){
			result = result*i;
		}
		return result;
	}

}
