package b1_bootcamptheoriesexamples;

public class O_Ply 

{
	public void getMondayReport(String metal, int price)
	{
	System.out.println(metal+ " is from Africa and it costs :" +price+ " Euros per gram ");
	}
	
	public void getTuesdayReport(int price, String metal, String location)
	{
	System.out.println(metal+ " is from Russia and it costs :"+price+ " Pounds per gram ");
	}
	
	
	// Method overloading 
	public void getMondayReport(String domain, String database)
	{
		System.out.println(domain+ " collected all the details from its :" +database+ " for the last 14 days report ");
	}
	
	public void getTuesdayReport(int employees, String location, String storage, int price)
	{
		System.out.println(location+ " has huge set up for the " +employees+" Software Engineers for the largest " +storage+ " with "+price+ " Millions");
	}
	

	
	
	public static void main (String arr[])
	  {
		
		O_Ply Obj1= new O_Ply();
		
	Obj1.getMondayReport("Gold" , 800);
	Obj1.getTuesdayReport(750, "Silver", "Dubai");
	Obj1.getMondayReport("Amazon", "Customers feedback on Textiles");
    Obj1.getTuesdayReport(100, "Newyork","DTC", 75);
	  
	  
	  }
	
}
