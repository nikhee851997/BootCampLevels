package b2_bootcampprogramming2;

 public class F_Bubblesrt 
  {

 public static void main(String[] args) 
	{
	// we created an array A .
	  int[] A = {8,5,1,9,9,7};
		
	  System.out.println("Array before sorting");
	  
	// This method is used to print an array A with spaces before bubble sorting.
	  printArray(A);
	  
	// This method is used to sort the elements by comparing it with its adjacent values and arrange in sorted order.But it starts its process from reverse which means last element will be highest element in array.	
      bubbleSort(A);
     
    // \n is used for printing in next line 
      System.out.println("\n Array after sorting");
      
  	// This method is used to print an array A with spaces after bubble sorting.
      printArray(A);
      
   }
 
 // It is a method for printing array numbers.
 public static void printArray(int [] A )
	{
		for(int number : A) // for each loop.
		{
			System.out.print(number+ " ");
		}
	}
 
// It is a method for sorting array using bubble sort algorithm.
 public static void bubbleSort(int[]A)
	 {
		int n = A.length;	
		
// This is a outerloop we used for passes.
		
		for(int i=0; i<n-1; i++)//n-1 is taken bec in bubble sort, we only use n-1 passes for comparing elem with its adjacent elem in array we will only use n-1 passes.
		   {
// Before swapping we make flag variable which act as indicator of that condition to 0.
			int flag = 0;
// This is a innerloop we used for swapping at each pass to form the sorted array.
			
 		for( int j=0; j<n-1-i; j++)// To control unwanted swaps in each pass even after they were sorted we restrict by subtracting i with n.
			{
// This is logic for swapping by comparing elements with its adjacent elements to form sorted array.
				if(A[j]>A[j+1])
				{
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
// If swapping is done flag variable will be updated to 1. 
					flag=1;
					
				}
			}// this loop runs until pass is done sucessfully. Which means assigning highest elements to lowest elements in its positions from last to first.
// If the flag variable is not updated in its respective cyckle it breaks the outer loop and stops it from moving further.	
			if(flag==0)
	        break;
			
		}
	}
	
	
}
