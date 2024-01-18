package b3_bootcampprogramming3;

import java.util.Scanner;

public class D_Even_Odd 
{

	public static void main(String[] args) 
	{
     
      System.out.println(" Enter the number");
      
      Scanner sc= new Scanner(System.in);
      
      int number = sc.nextInt();
      
    // Here we perform modulus operation which is when we do division it takes remainder result.
      
      int remainder= (number % 2);
       
       if(remainder == 0)
       {
    	   System.out.println(number+" is an even number");
       }
       else //(remainder == 1)
       {
    	   System.out.println(number+" is an odd number");
       }
      
       sc.close();
      
	}

}
