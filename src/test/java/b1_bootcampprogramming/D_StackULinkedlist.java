package b1_bootcampprogramming;

class Nodeee
{
	int key;      // key value is stored in node
	Nodeee next;  // next is pointer to next node in single linked list.
	
	public Nodeee(int key)
	{
		this.key=key;
		next = null;
		
	}
}
class D_StackULinkedlist
{
	private Nodeee top;  // the last inserted element in stack is considered as top/peek. It follows 1 indexing from bottom.
	
	D_StackULinkedlist()
	{
		top= null;     // assigning top is null.
		
	}
	
boolean isStackEmpty()   // method1
{
	return top == null;  // comparing whether top is null by ==.
	
}
 void push(int key)  // method 2(push means adding values from top in stack)
 {
	 Nodeee Eight = new Nodeee(key);  // creating a new Nodeee, Eight.
	 
	 if (isStackEmpty())
	 {
		 top = Eight;
	
	 }
	 else
	 {
		 Eight.next= top;  // next is a pointer pointing to previous top node in stack. Indirectly it means there is already a node present.
		 top = Eight;      // Eight is name of new nodeee and it will be current top node in stack.
	 } 
	 
 }
 int pop() //method 3 pop means removing values from top in stack.
 {
	 if(isStackEmpty())
	 {
		System.out.println("Stack is Empty");
		 return -1;
	 }
	 else
	 {
        int temp = top.key;   
        top = top.next;   // moving top pointer to next top node in stack.
        return temp;
	 }
	 
 }
  
int peek()	// method 4 peek means current top value in stack.
{
	if(isStackEmpty())
	{
	   System.out.println("Stack is Empty");
		return -1;
	}
	else 
	{
		return top.key;   // current top node will be returned. 
	}
}


	public static void main(String[] args) 
	{
      D_StackULinkedlist object = new D_StackULinkedlist();
      
     object.push(85);
     object.push(99);
     object.push(120);
     
     
     System.out.println(" peek value in stack is : " +object.peek());
     
     
     System.out.println(" pop value out of stack is : " +object.pop());

     
     System.out.println(" now the peek value in stock  is : " +object.peek());
	}
}

    		   
		
		
		
		
		
		
		
		
		
