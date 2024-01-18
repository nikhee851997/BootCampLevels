package b2_bootcampprogramming2;

public class B_Palindrome 
{
    public static void main(String arr[])
   {
        int rem;
        int sum = 0;
        int temp;

        int num = 858;
        temp = num;

        while (num > 0) 
        {
            rem = num % 10;  // modulus: 858%10=8.(remainder value)
            sum = (sum * 10) + rem;  // Each time remainder value  will be changed based on prev operation: 0+8=8, now sum value is 8 in next cycle.
            num = num / 10;  // division result: 858/10= 85.
        }

        if (temp == sum)
        { 
            System.out.println("Palindrome number");
        } 
        else 
        { 
            System.out.println("Sorry, it is not a palindrome number");
        }
    }
}
