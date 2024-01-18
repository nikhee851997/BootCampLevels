package b3_bootcampprogramming3;

import java.util.Scanner;

public class C_Avg 
{

	public static void main(String[] args)
	{
     
     System.out.println("Enter the first number");
     
     Scanner sc = new Scanner(System.in);
     
     int num1 = sc.nextInt();
     
     System.out.println(" Enter the second number");
     
     int num2= sc.nextInt();
     
     System.out.println("Enter the third number");
     
     int num3= sc.nextInt();

     int average= (num1+num2+num3)/3;
     
     System.out.println("The average result of three numbers is :"+average);
     
     sc.close();
	}

}
