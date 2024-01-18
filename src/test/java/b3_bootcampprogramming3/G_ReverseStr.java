package b3_bootcampprogramming3;

import java.util.Scanner;

public class G_ReverseStr
{
	public static void reverseString(char [] C, int Size)
	{
		if(Size>0)
		{
	      System.out.print(C[Size-1]);
	      
	      Size--;
	      
	      reverseString(C,Size);
		}
	}
	
	
	public static void main(String[] args)
	{
      Scanner Sc= new Scanner(System.in);
      
      System.out.println("Enter the name of the person");
      
      String res= Sc.nextLine();
      
      char[] C= res.toCharArray();
      
      int Size= C.length;
      
      reverseString(C,Size);
      
      Sc.close();
	}

}
