package b1_bootcamptheoriesexamples;

public class Q_Ply_2 extends O_Ply
{
	// Method overriding
		public void getMondayReport (String metal, int price)
		{
		System.out.println(metal+ " is from India and it costs : " +price+ " Rs per gram " );
		}
		public void getTuesdayReport (int price, String metal, String location)
		{
		System.out.println(metal+ " is from :" +location+ " it costs around :" +price+ " Dinams per gram");
		}

		public static void main (String arr [])
		{
			Q_Ply_2 Obj2= new Q_Ply_2();

		Obj2.getMondayReport("Copper" , 100);
		Obj2.getTuesdayReport(50, "Iron", "Dubai");
		
		}
}
	
	
	

