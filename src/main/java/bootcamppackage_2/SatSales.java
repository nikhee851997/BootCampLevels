package bootcamppackage_2;

import bootcamppackage_1.FriSales;

public class SatSales extends FriSales
{
	
 String Dish3;
 int Price3;
	
  void getSaturdayReport()
  {
	  super.getSaleReportFriday();
	  
	  System.out.println("The chefs special new dish that was added with name: " +Dish3+ " was sold at a price point of: "  +Price3+ " dollars");
	  
  }
  
	
  public static void main(String arr[])
  {
	  SatSales Objct= new SatSales();
	
	  Objct.Dish3= "kerlaLobstercurry";
	  Objct.Price3= 30;	  
	  Objct.getSaleReportFriday();
	  Objct.getSaturdayReport();

	  
  }
  
  
}
