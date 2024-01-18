package b3_bootcampprogramming3;

public class E_Prime
{
	public static void main(String[] args)
	{
 // prime numbers are greater than 1, this are divisible by 1 and itself.
		
      int number = 13; // 13 is divided by 1 and itself , so it is prime number.
      
      int temp =0;
      
  // since the numbers should be greater than 1,started the loop with i=2.
      
      for(int i=2; i<=number/2; i++)
	  {

    	 if(number%i==0) // modulus : remainder of division is considered.
    	  {
    		  
 // temp variable is linked with if condition where it checks modulus(remainder of division)result is ==0)
 // If the result is 0 it add  value 1  to it. So now temp = 1.
    		  temp=temp+1;
    		  break;
    	  }
	  }
      
 // when compared(==) if the temp variable is still 0, which means modulus result is not 0, then number is a prime number.
      
     if(temp==0)
      {
    	  System.out.println(number+ " is a prime number ");
    	  
      }
      else
      {
    	  System.out.println(number+ " is not a prime number ");
      }

   }
}
