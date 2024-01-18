package b1_bootcampprogramming;

class Node
{
	int key;            // key value that is stored in Node.
	Node left;
	Node right;        // Two diff type of nodes used based on values.
	
	Node(int i)
	{
		key=i;
		left=null;
		right=null;
	}
	
}
class A_BinarySearchTree 
{
	Node root; //    The name of base node that is first used for storing value in tree.
	
	A_BinarySearchTree() // It is  a constructor
	{
		root=null;
	}
	
	void insert(int key)  //  It is a insert method
	{
		 root = insertRec(root,key);   // recurssion approach is used bec it keeps on calling its method, for comparing with new value to insert it in their position in binary search tree.
	}
	
	Node insertRec(Node root, int key) // It is also a method with return type root which is Node.
	{
	   if(root == null)  // condition
		{
		   root= new Node(key);
		}
		
	    if(key < root.key)
		{
		   root.left=insertRec(root.left, key);  // Smaller than root key value will be stored left. 
		}
	    else if(key > root.key)
	    {
		   root.right= insertRec(root.right,key); // Greater than root key value will be stored right.
	    }
		  
	    return root;
	 }
	

   boolean search(int key)  // It is a search method 
   {
	  return searchRec(root,key);
   }
   
  boolean searchRec(Node root, int key)  // It is also a method with return type boolean 
	{
		if(root == null)
		{
		    return false;
		}
 
		if(key == root.key)
		{
		   return true;
		}
	
	    if(key < root.key)
	    {
	       return searchRec(root.left, key);
	    }
	    else if(key > root.key)
	    {
	        return searchRec(root.right, key);
	    }
	   
	   return false;
	}
	
	

	public static void main(String[] args)
	{
		A_BinarySearchTree object = new A_BinarySearchTree();
		
		// Inserting nodes with keys into tree
		object.insert(8);
		object.insert(5);
		object.insert(1);
		object.insert(9);
		object.insert(11);
		object.insert(7);
		
      // search for keys 
		int find = 11;
		if(object.search(find))
		{
			System.out.println("key " +find+ " is found in tree");
		}
		else
		{
			System.out.println("key " +find+ "  is not found in tree");
		}
	}

}
