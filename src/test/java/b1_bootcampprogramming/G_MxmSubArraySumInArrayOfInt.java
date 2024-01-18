package b1_bootcampprogramming;

public class G_MxmSubArraySumInArrayOfInt
{
	
	static int findMaxSubarraySum(int[] A) // method to findMaxSubArray  
	{
	  	int maxSum= A[0];                  // variables maxSum,sum... Intially it will be taken value at A[0] position.
		int sum= A[0];
		
		for(int i=1; i<A.length; i++)      // since we had taken sum, maxSum value at A[0] we are starting iterating our loop from index 1.
		{
		     if(sum<0)                    // sum will be keep on changing <0 that array breaks as subarray over there and new sum will be next index position and also new sub array will be formed from there .
		     {
		    	 sum=A[i];              
		     }
		     else
		     {
		    	 sum=sum+A[i];
		     }
		     maxSum= Math.max(sum, maxSum);  // Kadanes algorithm uses this comparision to find maxSubArray with in array of integers.
		     
		}
		return sum;
	}
	
		
	public static void main(String[]arr)
		{	
		int[] A= {8,6,-4,5,-17, 3,7};
		
		int result= G_MxmSubArraySumInArrayOfInt.findMaxSubarraySum(A);
		
		System.out.println("Maxsum in the array is : " +result);
		}
		
	}

	
	
	
	
	
	
	

	


