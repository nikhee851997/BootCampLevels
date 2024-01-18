package b2_bootcamptheoriesexamples2;

 //public class Theater
   
	class Tv
	{
	    String Movie;
	    int Giftcard;
	    
	    public void seatN()
	    {
	    	System.out.println("people who brought tickets to the " +Movie+ " with :" +Giftcard+ " dollars gift card will only be accepted");
	    }
	    
	}
	public class Theater extends Tv
	{
	    public void seatM()
	    {
	    	System.out.println("people with out : "+Giftcard+ " dollars gift card today will get an access to " +Movie+ " watching experience");
	    }
   
	    public static void main(String[]arr) 
	    {
	  	Theater obj = new Theater();
	  	
	  		obj.Movie="Salaar";
	  		obj.Giftcard=80;
	  		obj.seatM();
	  		obj.seatN();
	  		
// It(instanceof) is a method, used for checking whether object belongs to specific class/type.
	  	
	  	boolean result = obj instanceof Theater;
	     
	  	System.out.println();
	  		
	  	System.out.println("instanceof rslt : " +result);
	  		   
	  	}
     }
	    
	    
	    
	
   

   
    