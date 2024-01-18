package b1_bootcamptheoriesexamples;

   class Sample
   {
	int budget;
	String name1;
	String name2;
	
	Sample(int i, String s1, String s2)
	{
		budget = i;
		name1  = s1;
		name2  = s2;
		System.out.println("Designing the project is done by : " +name1+ " ,Testing the project is done by : " +name2+ " ,In the budget : " +budget);
	}
	
}


public class J_Uper extends Sample
{
	int time;
	String tittle;
	
	J_Uper(int i, int j, String s1, String s2, String s3)
	{
		super(i, s1, s2);
		
		time=j;
		tittle= s3;
		
		System.out.println("tittle of the project is : " +tittle);
		System.out.println("time given to complete project is : " +time+ " days");
			
	}
	
	public static void main(String arr[])
	{
		J_Uper obj = new J_Uper(800, 8, "Nicholas","jennie", "THe8");
		
	
	}
}