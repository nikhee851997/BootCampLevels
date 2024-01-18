package b1_bootcampprogramming;

public class H_MergeSort
{
	
	public static void main(String[] args) 
	{
		H_MergeSort object = new H_MergeSort();
		
		int[] A= {8, 9, 5, 16, 15, 4, 18 ,6};
		
		// calling sorted array
		object.MergeSort(A, 0, A.length-1);
		
	   // Displaying sorted array
		System.out.println("sorted array is : ");
		
		for(int num : A) // for each loop
		{
			System.out.print(num + " ");
		}
		
	}
	
	
	
	public void MergeSort(int[] A,int lp,int rp)   // method 1.
	{
		if(lp<rp)            // lp, up are pointers of array. Also it checks if lp, up pointers doesnot crossed each other. 
		{
			int mid=(lp+rp)/2;
			MergeSort(A,lp,mid);
			MergeSort(A,mid+1,rp);
			merge(A,lp,mid,rp);
			
		}
	}
	
	
	public void merge (int[] A, int lp, int mid, int rp)
      {
	    int i = lp;       // i pointer in the left sorted subarray starts from lp
	    int j = mid + 1;  // j pointer in the right sorted subarray starts from mid+1
	    int k = lp;       // k pointer in temporary array (B) starts from lp

	    int[] B = new int[A.length];  // 1-D array.

	    while (i<= mid && j<=rp)  //This loop works only when merge sort is done for that subarrays.
	    {
	        if (A[i] < A[j])      // By this condition we do merge of sorted sub arrays A[i],A[j] into sorted array.
	        {
               B[k++] = A[i++];
	        } 
	       else //(A[j] < A[i])
	        {
	            B[k++] = A[j++];
	        }
	    }

	    // Copy remaining elements from left subarray if (j>rp).
	    while (i <= mid) 
	    {
	        B[k++] = A[i++];
	    }

	    // Copy remaining elements from right subarray if (i>mid).
	    while (j <= rp) 
	    {
	        B[k++] = A[j++];
	    }

	    // Copy elements back from temporary array to original array A
	    for (k = lp; k <= rp; k++)
	    {
	        A[k] = B[k];
	    }
	   
	}
}

