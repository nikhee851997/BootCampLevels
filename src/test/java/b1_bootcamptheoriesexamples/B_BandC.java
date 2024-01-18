package b1_bootcamptheoriesexamples;

public class B_BandC 
{
  public static void main (String arr[])
	{
		
	// Break Statements (When encountered inside a loop, it immediately terminates the loop and transfers the control to the statement following the loop)
	  
	for (int i=0; i<=8; i++) // initial, condition, increment
	{
	  if(i==5) // condition
	  break;
	  System.out.println("value of i at this point is : " +i);
	}

	System.out.println();
	
	// Continue Statements (When encountered inside a loop, it skips the remaining code inside the loop for the current iteration and moves to the next iteration)
	
	for (int j=8; j>=0;j--) // initial , condition, decrement
	{
	if(j==4) // condition
	continue;
	System. out. println (" value of j at this point is: " +j);
	}

}
}
