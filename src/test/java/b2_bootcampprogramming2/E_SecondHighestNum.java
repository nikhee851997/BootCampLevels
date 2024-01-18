package b2_bootcampprogramming2;

public class E_SecondHighestNum 
{

	public static void main(String[] args) 
	{

		int[] num = {8,5,1,9,9,7};
		
		int n = num.length;
		
		int highest = Integer.MIN_VALUE; // lowest possible integer value in a way like -infinity.

		int secondHighest= Integer.MIN_VALUE;
		
	    for(int i=0; i<n ; i++)// here i starts with 0 & it will be till i<n; if i is started with 1 & it will be till i<=n. It need to traverse entire array.
	    {
		  
		if(num[i]>highest) 
		{			
			secondHighest = highest; // this is accnd to last highest value before highest value is changed.Intially it might be Int.min...later accnd to cycle it will be last highest value.
	 
			highest= num[i];         // if condition is met highest value will be updated.

		}
		if(num[i]< highest && num[i]>secondHighest)
		{
               secondHighest= num[i]; // if the secondHighest value is changed in intial condition it will be updated in both conditions.
                  
		}
		
		}
	    
	    // repeated values, few small values may not be satisfied either conditions so those are not considered.
	    
	    System.out.println("second highest number is : "+ secondHighest);

	}	
		
	}


