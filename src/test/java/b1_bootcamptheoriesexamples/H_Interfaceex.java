package b1_bootcamptheoriesexamples;

interface Testing
 {
	String Watch = "Huawei";
	String Phone = "Apple";
	
void getFromSaleInAmaon();
	
 }
interface Test extends Testing
 {
	 
	 String Television= "Sony";
	 String Laptop= "HP";
	 
 void getFromSaleInFlipkart();	
 
 }
 
public  class H_Interfaceex implements Test
 {

	public void getFromSaleInAmaon() 
	{
		   System.out.println("In Amazon gadgets have 80% off especially on :" + Watch);
		   System.out.println("In Amazon refurbished products are available for :" +Phone);
		
	}

	public void getFromSaleInFlipkart() 
	{
		 System.out.println("In flipkart we cannot find any products in the brand :"+ Television);
		 System.out.println("In flipkart reviews of the : "+Laptop+"  products are not that good");
	}
	
	public static void main(String array[])
	{
		H_Interfaceex object = new H_Interfaceex();
		object.getFromSaleInAmaon();
		object.getFromSaleInFlipkart();
	}
 }

