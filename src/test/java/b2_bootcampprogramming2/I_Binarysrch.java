package b2_bootcampprogramming2;

public class I_Binarysrch 
{
	public static void main(String[] args) 
	{
		
       int [] A= { 1,5,6,7,8,9,11};
       
       // method with return type int.
       int index=binarySearch(A, 8);
       
       if(index!=-1)
       {
    	   System.out.println("Element found at : " +index );
    	   
       }
       else
       {
    	   System.out.println("Element not found in an array");
       }
	}   
	
	// Method for searching for an element in sorted array by uing binary search principle.
	public static int binarySearch(int[] A, int target)
	{
		int lp= 0;
		int rp= A.length-1;
		
//lp, rp are pointers in both directions this loop is runned until condition those pointers cross each other in sorted array.
		while(lp<=rp)
		{
			int mid= (lp+rp)/2;
			
			if(A[mid]==target)
			{
				return mid;
			}
			
			else if(A[lp]<=A[mid])
			{
				if(A[lp]<=target&& target<=A[mid])
				{
					rp=mid-1;
				}
				else
				{
					lp=mid+1;
				}
			}
			
			else//(A[mid]<=A[rp])
			{
				if(A[mid]<=target&& target<=A[mid])
				{
					lp=mid+1;
					
				}
				else
				{
					rp=mid-1;
				}
			}
			
		}// Before the condition is met, it keeps on searching for target element repeatedly by using lp, rp, mid.  
		
		return -1;	
	}
	
	
	
}

