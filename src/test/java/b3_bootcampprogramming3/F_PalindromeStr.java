package b3_bootcampprogramming3;

public class F_PalindromeStr
{

	public static void main(String[] args) 
	{
     String A= "ALEELA";
    
     int size= A.length();
     
     int lp=0;
     int rp=size-1;
     int temp=0;
     
     while(lp<=rp)
     {
    	 if(A.charAt(lp)!=A.charAt(rp))
    	 {
    		 temp=1;
    		 break;
    	 }
    	 
    	 lp++;
    	 rp--;
    	 
     }
     
     if(temp==0)
     {
    	 System.out.println("String given is a Palindrome");
     }
     else
     {
    	 System.out.println("String given is not a palindrome");
     }
  
	}

}
