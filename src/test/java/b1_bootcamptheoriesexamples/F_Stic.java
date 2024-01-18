package b1_bootcamptheoriesexamples;

public class F_Stic
{
    private static int instanceCount = 0; // variable

    public F_Stic() // special method-constructor
    {
    
        instanceCount++; // Incrementing the count each time an object is created
    }

    public static int getInstanceCount() // method
    {
       return instanceCount; // Static method to access the instance count
    }

public static void main(String arr[])
{
	System.out.println("Intially it is :" +F_Stic.getInstanceCount());
	
	F_Stic object1 = new F_Stic();
	
	F_Stic object2 = new F_Stic();
	
	F_Stic object3 = new F_Stic();
	
	System.out.println("Later it is :" +F_Stic.getInstanceCount());

     	
	
}
	
	
	
	
	

	       
	
	
	
	
	
	
	
	
	
	
	
	
}
