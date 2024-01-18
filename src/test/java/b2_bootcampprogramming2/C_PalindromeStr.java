package b2_bootcampprogramming2;

public class C_PalindromeStr 
{

 public static void main(String[] args) 
	{

		String str= "MADAM";
		
		int lp= 0;
		int rp= str.length()-1;
		
		
		boolean isPalindrome=true; // flag variable .which act as indicator for execution of program. 
		
		while(lp<=rp) // This loop runs until both pointers(lp,rp) cross each other, once those are crossed it stops. 
		{
			
	// It checks with first charcter in string if that condition is satisfied, 
			
			if(str.charAt(lp)!= str.charAt(rp))
			{
			isPalindrome= false;
			break;
			}
			
			lp++; // lp keeps moving towards right.
			rp--; // rp keeps moving towards left.
			
		}
		
		if(isPalindrome)
		{
			System.out.println("String is a Palindrome");
			
		}
		else
		{
			System.out.println("String is not a Palindrome");
			
	    }
		
   }

}

