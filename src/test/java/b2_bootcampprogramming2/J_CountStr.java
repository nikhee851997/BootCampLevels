package b2_bootcampprogramming2;

public class J_CountStr 
{
	public static void main(String[] args)
	{
      String text= "Nikhil Korrapati India";
      
      // It is a method that we use for counting no of words in string and its return type is int.
      int wordsCount= countWords(text);
      
      System.out.println("Number of words: " +wordsCount);
      
	}
	
      // Defining that method to find no of words in string.
      public static int countWords(String text)
      {
    	  if(text==null || text.isEmpty())
    	  {
    		  
    		  return 0;
          }
// split is a method used in string to make them into array of substrings.
//........\\s is escape sequence : which means it is a character with single back slash that has special meaning. (\t[tab],\n[newline]) 
// first back slash is used when working with in a string acc to its own rules to represent a special character, where as sec back slash indicates the system character next to it has importance treat it differently when used in program.
//....\\s+ means not at all counting spaces those are in between words as we might have many spaces in between words occurence of that character can be one or more times in string, So we use + 
    	 
    	  String[] words= text.split("\\s+");
    	  // one dimensional array to store substrings.
    	  
    	  return words.length;
      
	  }

}
