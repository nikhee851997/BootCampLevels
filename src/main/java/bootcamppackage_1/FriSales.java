package bootcamppackage_1;

public class FriSales
{
	protected String Dish1="Lasanya";
	protected String Dish2="Lobster";
	protected int price1=18;
	protected int price2=20;
	
	protected void getSaleReportFriday()
	{
		System.out.println("This week : " +Dish1+ " sold high in veg section at a price point of  " +price1+ " dollars");
		System.out.println("This week : " +Dish2+ "  was not orderd at all " +price2+ " orders was expected for this dish");
			
	}
	
	public static void main(String arr[])
	{
	   FriSales object1 = new FriSales();
	   
	   object1.getSaleReportFriday();
	}
}
