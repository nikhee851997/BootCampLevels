package b1_bootcampprogramming;

public class C_SortArrayUQuicksort 
{
    public static void main(String[]arr)
    {
        int[] A = {8, 4, 12, 16, 18, 6, 3, 11};
           
        // calling quicksort
        quickSort(A, 0, A.length - 1);

        // Display the sorted array
        System.out.println("Sorted Array is :");
        
        for (int num : A)                                  //{3 4 6 8 11 12 16 18} it sorts full array in a particular order. By using for-each loop
        {
            System.out.print(num + " ");
        }
    }
    
// It is quicksort Method
    
    public static void quickSort(int[] A, int start, int end) //method 1
    {
        if (start < end)      // It means atleast array has two elements. Also start and end pointers doesnot crossed eachother.
        {
            int pivotIndex = partition(A, start, end); // result we are getting here is pivot posistion in array after doing partition.
            quickSort(A, start, pivotIndex - 1);  // Sort left sub-array
            quickSort(A, pivotIndex + 1, end);   // Sort right sub-array
        }
    }

    private static int partition(int[] A, int start, int end) //method 2
    {
        int pivot = A[start]; // Choosing the first element as the pivot
        int lp = start + 1;   // lp is left pointer
        int rp = end;         // rp  is right pointer

        while (lp <= rp)     // This loops runs until lp and rp cross each other 
        {
            while (lp<=rp && A[lp] < pivot) // lp keeps moving left until it find lp>pivot.
            {
                lp++;
            }
            while (lp<=rp && A[rp] > pivot) // rp keeps moving right until it finds rp<=pivot
            {
                rp--;
            }
           if (lp < rp)   // If lp,rp does not cross each other then it is lp<rp. Also, if lp, rp stops we have to swap lp value with rp value in their positions of array.
            {
                // Swap A[lp] and A[rp]
                int temp = A[lp];
                A[lp] = A[rp];
                A[rp] = temp;
            }
        }

        // Swap pivot (A[start]) with A[rp]
        int temp = A[start];
        A[start] = A[rp];
        A[rp] = temp;

        return rp; // Return the  pivotIndex         
                               
                                       // {6, 4, 3, 8, 18, 16, 12, 11} 
                                       // It make particular element pivot(8) and before pivot all elements are smaller than pivot,
                                       // After pivot all elements are bigger than pivot.
        
    }
}
