package b1_bootcampprogramming;

public class F_LngstCmnSubSeqofTwoStrngs 
{
	
	static String findLCS(String s1, String s2) // method
	{
  // Getting the lenth of input Strings and result will be int type.
		int x= s1.length();  
		int y= s2.length(); 
		
  // creating a 2-D array by adding extra row,coloumn to find LCS.
 // data type(2-D) arrayname =new datatype [R][C]...[size]   
		
		 int[][] A= new int [x+1][y+1];
		 
 // Building the Length table of 2-D array(A) to find LCS. By this we are reading data from String.
		
		for(int i=0; i<=x; i++) // rows .... X is name of String1.
		{
			for(int j=0; j<=y; j++) // coloumns....Y is name of String2.
			{
 // If the strings are empty , Lcs length is 0
				if(i==0|| j==0)  // or is T T -> T, T F -> T, F T ->T
				{
					A[i][j]=0;  // this are positions that will be stored in array 
				}
 // If the characters in  both "Strings" match, increment by 1 and add diagonally
 // over here i will be from 1, but when reading from string it will start with 0 indexing. To balance we use (i-1).

				else if(s1.charAt(i-1)==s2.charAt(j-1)) 
				{
					A[i][j]=1+A[i-1][j-1]; 
				}
 // If the characters in both "Strings" doesnot match, takes the maximum of previous LCS lengths with help of Math class.
                  	
				else
				{
					A[i][j]= Math.max(A[i][j-1], A[i-1][j]);
					
				}
			}
		}
		
	// Retrieve the LCS from 2-D arary(A) Length table
		
		 int index = A[x][y];        // Get the length of Longest common subsequence  
	     char[]lcs= new char[index]; // create an 1-D array to store char type values in lcs array.
	     int i = x, j = y;           
	    
	    while(i>0 && j>0)   
	    {
// If the characters in string match, from the incremented it moves in diagonally direction.
	    	if(s1.charAt(i-1)==s2.charAt(j-1))
	    	{
// To get LCS after adding values in 2-D array, it will start retrieving from array in backward and it stores in reverse order in char array from right to left.
	    	     lcs[index-1]= s1.charAt(i-1);    
	    	     index--;  // decrement index     	     
	    	       i--;    // movies path diagonally
	    	       j--;    // moves path diagonally     
	    	}
// If the characters in string doesnot match match, it takes max value and keep moving diagonally from left to right.
	    	
	    	else if (A[i][j-1] > A[i-1][j])
	    	{
	    		j--; // moving path left
	    	}
	    	else
	    	{
	    		i--; // moving path up
	    	}
	    }
	     return new String(lcs);
	}
	
	public static void main(String[] arr)
	{
		//Defining Strings
		String s1= "MISHIL";
		String s2= "NIKHIL";
		
		String result= F_LngstCmnSubSeqofTwoStrngs.findLCS(s1, s2);
		
		System.out.println(result);
		
		
	}
	

}
