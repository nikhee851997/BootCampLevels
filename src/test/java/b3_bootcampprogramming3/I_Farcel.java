package b3_bootcampprogramming3;

// This is a java program to convert Fahreheit to celsius.
  
public class I_Farcel
{
	public static void main(String[] args) 
	{
              double tempInF= 80;
              
              double tempInC= ((tempInF-32)*5)/9;
                            // ((80-32)*5)/9= (48*5)/9=(240/9)=26.6
              
           System.out.println("Temp in F: "+tempInF);
           System.out.println("Temp in C: "+tempInC);
              
	}

}
