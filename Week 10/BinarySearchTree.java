package week10;

public class BinarySearchTree {
	
	BSTNode head;
	
	public void insert(int data, String name)
	{
		BSTNode newNode = new BSTNode(data, name);  
		if(head == null)
		{  
			head = newNode;  
			return;  
		}  
		else
		{  
			BSTNode current = head, parent = null;  
			while(true) 
			{  
				parent = current;  
				if(data < current.data)
				{  
					current = current.left;  
					if(current == null)
					{  
						parent.left = newNode;  
						return;  
					}  
				}  
				else
				{  
					current = current.right;  
					if(current == null)
					{  
						parent.right = newNode;  
						return;  
					}  
				}  
			}  
		}  
	}
	
	 public String searchID(int ID)
	  {
	    String result = "10.0.0." + ID + " Not found";
	    if (head == null) return "Empty Tree";
	    BSTNode current = head;
	    if (head.data == ID)
	    {
	      result = "Found " + "10.0.0." + head.data + " "
	               + head.name ;
	    }
	    else
	    {
	      while (current.right != null)
	      {
	        if (current.data == ID)
	        {
	          result = "Found " + "10.0.0." + current.data + " "
	                 + current.name;         
	          }
	        current = current.right;
	      }
	    }
	    System.out.println(result);
	    return result;
	  }
	 
	 public String searchName(String name)
	  {
	    String result = "User " + name + " Not found";
	    if (head == null) return "Empty Tree";
	    BSTNode current = head;
	    if (head.name.equalsIgnoreCase(name))
	    {
	      result = "Found " + "10.0.0." + head.data + " "
	    		  	+ head.name;
	    }
	    else
	    {
	      while (current.right != null)
	      {
	        if (current.right.name.equalsIgnoreCase(name))
	        {
	          result = "Found " + "10.0.0." + current.data + " "                
	        		  + current.name;
	          break;
	        }
	        current = current.right;
	      }
	    }
	    System.out.println(result);
	    return result;
	  }
	 
	   public int countNode(BSTNode root){

	        
	        if(root==null)
	            return 0;

	        
	        return 1 + countNode(root.left) + countNode(root.right);
	    }
	 
	 private void inOrder(BSTNode node) {
		    if (node == null) {
		      return;
		    }   
		    
		    inOrder(node.left);
		    System.out.printf("%s ", "10.0.0." + node.data + ", " + node.name +"\n");
		    inOrder(node.right);
		  }
	 public void inOrder() {
		    inOrder(head);
		}

}
