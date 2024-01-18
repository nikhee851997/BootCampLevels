package b2_bootcampprogramming2;

public class A_FactorialURecursion 
{
	// Recursive method to calculate factorial
	
	public static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] arr)
	{
		int n=5;
		
		int result=factorial(n);
		
	  System.out.println("The factorial of "  +n+  " is: " +result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
