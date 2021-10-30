package week9;

public class BinarySearchTree {
	
	public BSTNode root;

	public void insert(int data)
	{
		BSTNode newNode = new BSTNode(data);  
		if(root == null)
		{  
			root = newNode;  
			return;  
		}  
		else
		{  
			BSTNode current = root, parent = null;  
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

	public void preOrderTraverse(BSTNode n)
	{  
		
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			System.out.print(n.data + " ");  
			if(n.left!= null)
			{
				preOrderTraverse(n.left);  
			}
			if(n.right!= null)
			{
				preOrderTraverse(n.right);  
			}
		}
		
	}  

	public void inOrderTraverse(BSTNode n)
	{  
		
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			if(n.left!= null)
			{
				inOrderTraverse(n.left);  
			}
			System.out.print(n.data + " ");  
			if(n.right!= null)
			{
				inOrderTraverse(n.right);  
			}
		}
		
	}  

	public void postOrderTraverse(BSTNode n)
	{  
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			if(n.left!= null)
			{
				postOrderTraverse(n.left);  
			}
			if(n.right!= null)
			{
				postOrderTraverse(n.right);  
			}
			System.out.print(n.data + " ");  
		}
		
	}
	
	
	public BSTNode search(BSTNode root, int key)
	{
	    
	    if (root==null || root.data==key)
	        return root;
	 
	    
	    if (root.data < key)
	       return search(root.right, key);
	 
	   
	    return search(root.left, key);
	}
	
	int maxDepth(BSTNode node)
    {
        if (node == null)
            return 0;
        else
        {
            
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
  
            
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
        
    }
        
        BSTNode delete(BSTNode root, int key)
        {
            
            if (root == null)
                return root;
     
            
            if (key < root.data)
                root.left = delete(root.left, key);
            else if (key > root.data)
                root.right = delete(root.right, key);
     
            
            else {
                
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
     
                
                root.right = delete(root.right, root.data);
            }
     
            return root;
        }
    }
