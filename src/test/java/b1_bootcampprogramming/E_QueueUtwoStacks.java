package b1_bootcampprogramming;

import java.util.Stack;

 class E_QueueUtwoStacks
  {

    private Stack<Integer>stack1;   
	private Stack<Integer>stack2;
	
	
	E_QueueUtwoStacks()
	{
		stack1= new Stack<Integer>();
	    stack2= new Stack<Integer>();
	    
	}
	
	
	private boolean isQueueEmpty()    // method 1: this we use as a condition in dequeue (pop) , peek method.
	{
		return stack1.isEmpty() && stack2.isEmpty(); // logical operator  T T -> T
	}


	
	public void enqueue(int value)  // method 2: inserting values into queue by using push(stack) 
	{
		stack1.push(value);
	}
	
	public int dequeue()           // method 3: deleting values from queue 
	
	{
		if(isQueueEmpty())         // Before deleting values checking whether queue is empty or not.
		
		throw new IllegalStateException("Queue is empty");
		
// In queue for deleting values it follows FIFO , but in stack it follows LIFO. 
// That is reason we created stck2 and insert values in it and delete lastvalue. 
// Where as last value in stack is first in queue.	
		
       if(stack2.isEmpty())        
        {
		  while(!stack1.isEmpty())
		  {
			  stack2.push(stack1.pop());     //For deleting value in queue by using pop(stack)
		  }
	    }
	
	    return stack2.pop();
	}
	
	
	public int peek()              // method 4: To  know top position in stack, peek method is used.
	{
		if (isQueueEmpty())
			throw new IllegalStateException(" Queue is empty");
		
		if(stack2.isEmpty())
		 {
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());    // As stack 1 is used for push values, stack 2 is used for pop , peek values  to do this we push values from stack 1 to stack 2 as queue follows FIFO and stack has LIFO.
			}
	   	}
	   
		return stack2.peek();      // By using this we get top value in stack 2 after pop acc to our logic and after this if we want to enqueue values into stack we have to push stack 2 values into stack1.
	}
	
	
	
	public static void main(String[] args)
	{
		E_QueueUtwoStacks object = new E_QueueUtwoStacks();
		
		object.enqueue(80);
		object.enqueue(50);
		object.enqueue(97);
		
		System.out.println(" The value that is popped from stack 2 is :" +object.dequeue());  // when we do dequeue it pops the top value in stack 2.( first value in queue)
		
		object.enqueue(100); // this can only be done in stack 1.
		
		System.out.println();
		
		System.out.println(" peek value that is on top of stack 2 is : " + object.peek());   // when we use peek it gets top value in stack 2 after pop acdng to our logic .
		
	}

}
