package b1_bootcampprogramming;

public class I_BinarySrchAlgforRotatedSortArray 
{
		
  int search(int[] A, int target)// method
 {
    int lp = 0;
    int rp = A.length-1;
    
    while(lp<=rp)  // lp, rp are pointers in array this loop runs until lp does not cross rp in array.
    {
    	int mid= (lp+rp)/2;
    	
    	if(A[mid]== target)// with this condition we are comparing whether A[mid]== target.
    	{
    		return mid;
    	
    	}
    
    	else if(A[lp]<=A[mid])
       {
    	   if(A[lp]<=target && target<= A[mid])  // If target lies in between left pointer and mid,
    	   {
    		  rp= mid-1;  // then its right half of array will be elminated 
    	   }
    	   
    	  else    
    	   {
    		  lp= mid+1;  // then its left half of array will be elminated.
    	   } 
       }
    	
       else //(A[mid]<=A[rp])
       {
    	   if(A[mid]<=target && target<= A[rp]) // If target lie in between mid+1 and rp,
		   {
			  lp=mid+1;  // then its left half of array will be elminated
		   }
    	   
		 else
		   {
			  rp=mid-1;  // then its right half of array will be elminated.
		   } 
    	   
       } 
    	
    } 
       
	 return -1;
    
}

   
	public static void main(String[] B)
	{
		I_BinarySrchAlgforRotatedSortArray object= new I_BinarySrchAlgforRotatedSortArray();
		
		int [] A = {16, 14, 2, 3, 4, 6, 8, 12};
		
		int index= object.search(A,8);
		
		if(index!=-1)
		{
			System.out.println("Element found at index :" +index);
			
		}
		else
		{
			 System.out.println("Element not found in an array");
		}
	}

}
