package b1_bootcamptheoriesexamples;

public final class N_Keywords
{
	
	String S1 = "Immigration";
	String S2 = "Visa";
	int i= 8;
	
	public void getReport()
	{
		System.out.println("Students: " +i+ " Landed In Dulles Airport after getting: " +S2+ " and could not clear :" +S1 );
	}
	
	
	public void finalize()throws Throwable // Throwable is superclass of all Exceptions & Errors
	 { 
		
	 }
	 public static void main(String arr[])  
	{ 
		 N_Keywords  Obj1 = new N_Keywords();
		 N_Keywords  Obj2 =  new N_Keywords();
		 
	     Obj1.getReport();
	   
	    System.gc (); // then system will call Garbage collector then it will call finalize () method to release references before cleaning up unused object space. 
	}
}


