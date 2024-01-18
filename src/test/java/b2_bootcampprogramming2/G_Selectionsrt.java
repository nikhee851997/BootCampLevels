package b2_bootcampprogramming2;

public class G_Selectionsrt 
{

	public static void main(String[] args) 
	{
       int [] A = {8,5,1,9,9,7};
       
       System.out.println("Array before sorting");
       
       //This is used to print elements in array with spaces before sorting of array is done.
       printArray(A);
       
 //we are doing sorting by taking first element in array as min value and comparing it with its adjacent values
 //to check if there are any min elements.If yes it swaps them into sorted array rest will be in unsorted array of array.
       selectionSort(A);
       
      System.out.println("\n Array after sorting");
      
      // This is used to print elements in array with spaces after sorting of array is done.
       printArray(A);
        
	}  
	
	//It is a method for printing array numbers
	public static void printArray(int[] A)
	{
		for(int number: A)
		{
			System.out.print(number+ " ");
		}
	}
	//It is a method for sorting array using selectionSort algorithm.
      public static void selectionSort(int[] A)
      {
    	  int n = A.length;
    
   // This is outer loop for the passes.
      for(int i=0; i<n-1; i++)
      {
    	  
   // Initially taking first value as minimum element and i is pointer to it.
    	  int min = i;
    	  
    // This is inner loop that is used for finding smallest element in an array by j pointer, which starts pointing from next position towards right by traversing array.	  
       for(int j=i+1; j<n; j++)
    	 {
    //If we found any value that is smaller than min element we assigned earlier then we need to update it.
    		if(A[j]<A[min])
    	      {
    			 min=j; // Here min value will be its j value, when above condition is satisfied. Also that value will be same until above condition is again satisfied in next cycles. 
    		  }
    	 }// this loop runs until all values in j are compared with minimum value.
     // After finding real smallest element in array we need to check positions before swapping.
          if(min!=i)
          {
        	int temp = A[min];
        	A[min]= A[i];
        	A[i]=temp;
        	
          }
      }
  }
}