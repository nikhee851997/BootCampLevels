package b1_bootcamptheoriesexamples;

public class C_Vltile 
{
    private static volatile int sharedValue = 0; // Declaring a volatile variable
    
    public static void main(String[] args) 
    {
        // Thread 1: Updates the shared variable
          Thread thread1 = new Thread(() -> {                    // parameters, lambda expression, body(logic)
            for (int i = 0; i<5; i++) 
            {
                sharedValue++; // Incrementing the shared variable
                System.out.println("Thread 1: Shared value updated to " + sharedValue);
                try 
                {
                    Thread.sleep(1000); // Simulating some work being done
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        });
       
        // Thread 2: Reads the shared variable
        Thread thread2 = new Thread(() -> {
            int localValue = sharedValue; // Reading the shared variable
            while (localValue <5) 
            {
                if (localValue != sharedValue)
                {
                    System.out.println("Thread 2: Detected change in shared value: " + sharedValue);
                    localValue = sharedValue; // Updating local value to the new shared value
                }
            }
        });
        
        thread1.start();
        thread2.start();
    }
}

