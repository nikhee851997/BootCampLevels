package b1_bootcamptheoriesexamples;

public class D_Excp_1
{

	 public int a;
	 public int b;
     public int c;
	  
D_Excp_1()
{
 
	 a= 12;
	 b= 13;
     c= 0;
	
}

public static void main(String arr[])
{
	D_Excp_1 obj = new D_Excp_1();
	try
	{
    System.out.println("Result of a is : "   +obj.a);
    System.out.println("Result of b/c is : " +obj.b/obj.c);
	}
	catch(Exception e)
	{
		System.out.println(" 13/0 is not correct way to use ");
	}
    System.out.println("all are done");
}
		 
}   
