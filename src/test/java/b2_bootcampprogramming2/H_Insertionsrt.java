package b2_bootcampprogramming2;

public class H_Insertionsrt 
{
	public static void main(String[] args) 
	{
     int [] A = {8,5,1,9,9,7};
     
     System.out.println("Array before sorting");
     
     // This method is used to print array with spaces
     printArray(A);
     
     // This method is used to make first element in array as sorted and take an first element in unsorted array and keep it in temporary 
     // variable and compare it with sorted array elements in reverse order if the sorted array element is greater than temp variable element 
     // sorted array element will be shifted one position to its right and leave the ex-position empty and temp variable element will now check 
     // with next element in sorted array if there is process repeats if not temp variable element is placed in that position.Also if temp variable
     // element is smaller than elements in sorted array it will be arranged back in its position and it belongs to sorted array .
     
     
     insertionSort(A);
   
     System.out.println("\n Array after sorting");
   
     printArray(A);
     
	}
	
	public static void printArray(int[] A)
	{
		
         for(int number: A) // for each loop.
        {
    	   System.out.print(number+" ");
        }
   
	}

	public static void insertionSort(int[] A)
	{
		int n= A.length;
		
		for(int i=1; i<n; i++)// Here the loop starts with 1 indexing bec, unsorted array starts from here. sorted array take 0 indexing of array.
		{
//Temporary variable is created to store first element of unsorted array to compare with sorted array elements.
			
//After moving first element in unsorted array to temp variable,its position in array is empty which can be used for rewriting with new elements.  
			
			int temp = A[i];  
			
			int j= i-1;// In sorted array when comparing its elements with unsorted element in temporary variable it starts moving in reverse direction.
			
		 while( j>=0 && A[j]>temp) 
		 {
			A[j+1]=A[j];       // If elements in sorted array are greater than temp variable element,elements in sorted array moves one position to left and leaves the ex-position empty to compare.
			
			j--;             // If there are any elements in sorted array to compare it moves in reverse direction.
			
		 }// this loop runs until all elements in sorted array are compared with temp variable element. 
		    
		 A[j+1]=temp; // If the elements in sorted array are less than element in temp variable of unsorted array,temp variable element goes back to its position with no changes made.
		 
	    }
     }

}
