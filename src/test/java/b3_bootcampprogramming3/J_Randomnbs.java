package b3_bootcampprogramming3;

import java.util.Random;

public class J_Randomnbs 
{
	public static void main(String[] args) 
	{
 // Random is a class that is used for generating random numbers by using its methods.
        Random Rad= new Random();
        int numbers= Rad.nextInt(1, 100);
        System.out.println("Generated number is: "+ numbers);
        
	}

}
