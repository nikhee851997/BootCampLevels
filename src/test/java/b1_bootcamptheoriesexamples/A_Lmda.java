package b1_bootcamptheoriesexamples;

public class A_Lmda
{
	
interface A // functional interface : comparator interface is one among them which is mostly used with lamda expression to provide custom logic.
{

   String contact(String s1, String s2);
	
}

/*
 class B implements A
 {
	     String  contact(String s1, String s2)
	    {
	    	return s1+s2; // Here only return type of method is present.
	    	
	    }
 }
*/
public static void main(String arr[])
{
	
//()....If parameters are present inside to method inside subclass, write it up , if not leave empty  
//->....This is used for seperating parameters with body(logic)   
//{}..curly brackets....Represents body of lambda expression where logic ,return type is present to execute.
	
	
  A obj = (s1,s2)-> s1+s2;
 obj.contact("nikhee", "usa");

}   
}


