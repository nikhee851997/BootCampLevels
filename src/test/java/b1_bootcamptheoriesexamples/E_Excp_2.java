package b1_bootcamptheoriesexamples;

public class E_Excp_2
{
  String name;
  int marks[]= {2,4,6,8,10};
  
  E_Excp_2()
  {
    name = "Nikhil";
  }
  
  public static void main(String arr[])
  {
	  E_Excp_2 obj = new  E_Excp_2();
	  try
	  {
		  System.out.println(obj.name);
		  System.out.println(obj.name.charAt(3));
		  System.out.println(obj.name.charAt(6));
		  System.out.println(obj.marks[3]);
		  System.out.println(obj.marks[5]);
		  
	  }
	  catch(Exception e)
	  {
		  
		System.out.println("It has only 5 characters starting from 0"); 
	  }
  }

}
