package b2_bootcampprogramming2;

import java.util.Scanner;

public class D_ReverseStr 
{
	
	public static void reverseString(char[] ch, int size)
	{
		if(size>0)  // this is a condition.
		{
			
// Since we need our string to print in reverse order on our console we are trying to print from reverse.
			
			System.out.print(ch[size-1]);
			
			size--;
			
 // since we are not using any loops by using this statement we are calling our method by using recurssion approach.		
			
			reverseString(ch,size); 
			
		}
	}

	public static void main(String[] args)
	{
                     
	    Scanner Sc = new Scanner(System.in);
	    
		System.out.println("Enter the String");
		
// By using this this method we can print entire line and its return type is string.
		
		String St= Sc.nextLine();
		
// Converting String to charcters and it is now stored in array which has characters.As array is collection of elements of same datatype.
		
		char [] ch= St.toCharArray();
		
		int size= ch.length;
		
// calling the method for performing reverse operation.
		
		reverseString(ch,size);
		
		Sc.close();
	}
	
		
	}


