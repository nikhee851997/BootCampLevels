package b1_bootcamptheoriesexamples;

public class G_con
{
	private String Make;
	private String Model;
	private int Year ;
	
	
	G_con(String M1, String M2, int Y1)
	{
		Make = M1;
		Model = M2;
		Year = Y1;
	}
	
	public void getAutomobileDetails()
	{
		System.out.println("Name of the car is : "   +Make);
		System.out.println("Type of the car is : "   +Model);
		System.out.println("Year it was released is : " +Year);	
		
	}
	

	public static void main(String[] args) 
	{
		G_con A = new G_con("Ultimate", "8th Edition" , 1997);
        A.getAutomobileDetails();
	}

}
