package b1_bootcampprogramming;

class Nodee
{
	int key;        // key value is stored in node.
	Nodee prev;    // prev is a pointer to prev node.
	Nodee next;   // next is a pointer to next node.
	
 Nodee(int key)    // Its constructor
	{
		this.key  = key;
		prev = null;  
		next = null;  
	}
}

class B_DoubleLinkedList 
{
   Nodee head;  //  This stores the address of first node.
   Nodee tail;  //  This stores the address of  last node.
   
   B_DoubleLinkedList()   // Its constructor
  {
	  head = null;
	  tail = null;
	  
  }
	
  void insertAtEnd(int key) // It is a method
  {

// By creating object reference we are calling its constructor with specific key value.
	 Nodee First= new Nodee(key);     // creating a new Nodee, First.
	 
		 if(head==null)
		 {
			 head= First;
			 tail= First;
	      }
		 else
		 {
			 tail.next=First;   // next is a pointer in node that is pointing to next node 
			 First.prev=tail;   // prev is a pointer in node that is pointing to prev node
			 tail= First;	 
		 }
  }
  void forwardDisplay()
  {
	  Nodee up = head;

	  if(up == null) // It is condition that is comparing by using == .
		{
			System.out.println("List is Empty");
			return;
		}
	while(up!= null) // It runs the loop until (up = null)
	{
		System.out.println(" nodes with key pointing  to head is : " +up.key);
		up = up.next;
		System.out.println();
	   	
	}
  }
  
  void backwardDisplay()
  {
	  Nodee lp = tail;
	  if(lp == null)
		{
			System.out.println("List is Empty");
			return;
		 }
	
	  while(lp!= null)
   	{
		System.out.println();
		System.out.println(" nodes with key pointing to tail is :  " +lp.key);
	    lp= lp.prev;
	   
	}
		
  }
  
	
	public static void main(String[] args)
	{
		B_DoubleLinkedList object = new B_DoubleLinkedList();
		object.insertAtEnd(8);
		object.insertAtEnd(15);
		object.insertAtEnd(5);
		object.insertAtEnd(11);
		object.insertAtEnd(4);
		
		object.forwardDisplay();
		object.backwardDisplay();

	}

}
