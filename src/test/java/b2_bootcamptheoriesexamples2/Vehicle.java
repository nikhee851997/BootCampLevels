package b2_bootcamptheoriesexamples2;

public class Vehicle 
{
	String car;
	int model;
	
	public void checking()
	{
		System.out.println("Leading automobile " +car+ " is launching its new mdl:" +model+ " this year");
	}
	
	public static void main(String arr[])
	{
		Vehicle obj= new Vehicle();
		obj.car="NKL";
		obj.model=8;
		
		obj.checking();
	
// It(instanceof)is a method, used for checking whether object variable belongs to specific datatype/class.
		boolean result = obj.car instanceof String;
		
		System.out.println();
		
		System.out.println("instanceof keyword reslt is:" +result);
		
			
		
	}

}
