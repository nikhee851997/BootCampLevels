package b1_bootcamptheoriesexamples;


class MovieTickets
{
	       boolean booked= false;
	
	public synchronized void bookTickets(String name)  // method
	{
		if(booked==false)  // comparing 
		{
		System.out.println(name+" you had successfully added tickets to cart");
		System.out.println(name+" you had finished the payment");
		System.out.println(name+" you are good to go, Enjoy your movie");
		booked=true;     // assigning 
		}
		else
		{
			System.out.println();
			System.out.println(" we appreciate your choice " +name+ " sorry this Seat is already booked");
		}
	}
}

class Mythread extends Thread
{
	MovieTickets M;
	String name;
	

   Mythread(MovieTickets obj, String N)
	{
		M= obj;
		name = N;
		
	}

	public void run()
	{
		M.bookTickets(name);
	}
	
	
}
 class I_Tred 
{
public static void main(String array[])
{
	//creating object of the class 
	MovieTickets Seat8 = new MovieTickets();
	
	//Creating FirstThread and passing parameters with Object of class , Name of the First Thread
	Mythread object1 = new Mythread(Seat8, "Nicholas");
	Thread Orginal= new Thread(object1);
	Orginal.start();
	
	//Creating SecondThread and passing parameters with Object of class, Name of the SecondThread
	Mythread object2 = new Mythread(Seat8, "Nik");
	Thread OG= new Thread(object2);
	OG.start();
	
	
}


}
