package b3_bootcampprogramming3;

import java.util.Scanner;

public class B_Sum 
{
	public static void main(String[] args)
	{
// Firstly this will be printed.
		 System.out.println("Enter first number");
		 
// Scanner class that reads data from user system directly.
		  Scanner Sc = new Scanner(System.in);
		  
// By using nextInt method we can enter int type value and it will be stored in num1. 
		  int num1= Sc.nextInt();
		  
// Next this will be printed.
	   System.out.println("Enter second number");
		  
// By using nextInt method we can enter int type value and it will be stored in num2. 
	    int num2= Sc.nextInt();
		  
// By using result variable we perform sum operation of two numbers and store in it.	    
		  int result = num1+num2;
		  
		  System.out.println("The result of two numbers is :" +num1+ "+" +num2+ "=" +result);
		  
		  Sc.close();
		  
	}

}
