package b3_bootcampprogramming3;

public class A_Helo 
{
 String s1; 
 String s2;
 String s3;
 
 A_Helo(String s1, String s2, String s3)
 {
	 
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	
	System.out.println(s1+ " " + s2+ " ," +s3+ ".");
	
 }
 
public static void main(String[] args) 
  {
	A_Helo obj= new A_Helo("Hello","world","This is Nik");
		
  }

}
