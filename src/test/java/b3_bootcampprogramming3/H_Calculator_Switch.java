package b3_bootcampprogramming3;

import java.util.Scanner;

public class H_Calculator_Switch 
{
	public static void main(String arr[])
	{
    
    System.out.println(" 1- Addition \n 2- Subtraction \n 3- Multiplication \n 4- division");
    
    System.out.println("what kind of operator would you like to use : ");
    
    Scanner sc = new Scanner(System.in);
    
    int operator = sc.nextInt();
    
    System.out.println("Enter the first number: ");
    
    int num1= sc.nextInt();
    
    System.out.println("Enter the second number: ");
    
    int num2= sc.nextInt();
    
    sc.close();
    
    int result =0;
    
    switch(operator)
    {
    
       case 1:
               result= num1 + num2;
               break;
       case 2: 
    	       result = num1 - num2;
    	       break;
    	      
       case 3: 
    	       result = num1 * num2;
    	       break;
    	       
       case 4: 
    	      result = num1 / num2;
    	      break;
    	      
       default:
    	       System.out.println("please check the values that you had entered");
    	                
    }
    
    System.out.println("The result for the above operation is :" +result);
    
  }
	
}