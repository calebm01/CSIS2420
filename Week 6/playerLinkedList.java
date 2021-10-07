package week6;

public class playerLinkedList {
	
	Node head;

	  public void append(int ID, String firstName, String lastName, String playerName, String playerType, double lifePoints, int totalScore)
	  {
	    if (head == null)
	    {
	      head = new Node(ID, firstName, lastName, playerName, playerType, lifePoints, totalScore);
	      return;
	    }
	    Node current = head;
	    while (current.next != null)
	    {
	      current = current.next;
	    }
	    current.next = new Node(ID, firstName, lastName, playerName, playerType, lifePoints, totalScore);
	  }
	  
	  public void prepend(int ID, String firstName, String lastName, String playerName, String playerType, double lifePoints, int totalScore)
	  {
	      Node new_node = new Node(ID, firstName, lastName, playerName, playerType, lifePoints, totalScore);
	   
	      
	      new_node.next = head;
	   
	      
	      head = new_node;
	  }
	  
	  
	  void delete(int key)
	  {
	      
	      Node temp = head, prev = null;

	      
	      if (temp != null && temp.ID == key) {
	          head = temp.next; // Changed head
	          return;
	      }

	      
	      while (temp != null && temp.ID != key) {
	          prev = temp;
	          temp = temp.next;
	      }

	      
	      if (temp == null)
	          return;

	      
	      prev.next = temp.next;
	  }
	  
	  
	  public String searchID(int ID)
	  {
	    String result = "Not found";
	    if (head == null) return "Empty List";
	    Node current = head;
	    if (head.ID == ID)
	    {
	      result = "Player ID: " + head.ID
	             + "\n Name: " + head.firstName + " "
	             + head.lastName + "\n player name: "
    	                 + current.playerName + "\n Type: "
	             + head.playerType;
	      System.out.println(result);
	    }
	    else
	    {
	      while (current.next != null)
	      {
	        if (current.ID == ID)
	        {
	          result = "Player ID: " + current.ID
	                 + "\n Name: " + current.firstName + " "
	                 + current.lastName + "\n player name: "
	    	                 + current.playerName + "\n Type: "
	                 + current.playerType;        }
	        current = current.next;
	        System.out.println(result);
	      }
	    }
	    return result;
	  }

	  public String searchName(String firstName, String lastName)
	  {
	    String result = "Not found";
	    if (head == null) return "List Empty";
	    Node current = head;
	    if (head.firstName.equalsIgnoreCase(firstName) &&
	        head.lastName.equalsIgnoreCase(lastName))
	    {
	      result = "Player ID: " + head.ID
	             + "\n Name: " + head.firstName + " "
	             + head.lastName + "\n player name: "
    	                 + current.playerName + "\n Type: "
	             + head.playerType;
	      System.out.println(result);
	    }
	    else
	    {
	      while (current.next != null)
	      {
	        if (current.next.firstName.equalsIgnoreCase(firstName) &&
	            current.next.lastName.equalsIgnoreCase(lastName))
	        {
	          result = "Player ID: " + current.ID
	                 + "\n Name: " + current.firstName + " "
	                 + current.lastName + "\n player name: "
	    	                 + current.playerName + "\n Type: "
	                 + current.playerType;
	          System.out.println(result);
	          break;
	        }
	        current = current.next;
	      }
	    }
	    return result;
	  }
	  
	  public String searchPlayerName(String playerName)
	  {
	    String result = "Not found";
	    if (head == null) return "List Empty";
	    Node current = head;
	    if (head.playerName.equalsIgnoreCase(playerName))
	    {
	      result = "Player ID: " + head.ID
	             + "\n Name: " + head.firstName + " "
	             + head.lastName + "\n player name: "
    	                 + current.playerName + "\n Type: "
	             + head.playerType;
	      System.out.println(result);
	    }
	    else
	    {
	      while (current.next != null)
	      {
	        if (current.next.playerName.equalsIgnoreCase(playerName))
	        {
	          result = "Player ID: " + current.ID
	                 + "\n Name: " + current.firstName + " "
	                 + current.lastName + "\n player name: "
	    	                 + current.playerName +"\n Type: "
	                 + current.playerType;
	          System.out.println(result);
	          break;
	        }
	        current = current.next;
	      }
	    }
	    return result;
	  }

	  public Node searchReturnReference(int ID)
	  {
	    Node result = null;
	    if (head == null) return null;
	    Node current = head;
	    if (head.ID == ID)
	    {
	      result = current;
	    }
	    else
	    {
	      while (current.next != null)
	      {
	        if (current.next.ID == ID)
	        {
	          result = current.next;
	        }
	          current = current.next;
	        }
	      }
	      return result;
	    }
	  
	  public int length()
	  {
	      Node temp = head;
	      int count = 0;
	      while (temp != null)
	      {
	          count++;
	          temp = temp.next;
	      }
	      return count;
	  }

	  public void printPlayerList()
	  {
	    Node current = head;
	    System.out.print("List Contents: \n");
	    while (current != null)
	    {
	      System.out.print( current.ID + ", " + current.firstName + ", " + current.lastName + ", " + current.playerName + ", " + current.playerType + ", " 
	    		  + current.lifePoints + ", " + current.totalScore  + "\n");
	      current = current.next;
	    }
	    System.out.println("null");
	  }
	  
	  public String highScore(Node head)
	  {
		  int max = Integer.MIN_VALUE;
		  
		    while (head != null)
		    {
		 
		        
		        if (max < head.totalScore)
		            max = head.totalScore;
		        head = head.next;
		    }
		  System.out.println("The highest score in the list is: " + max);
		  return null;
	  }
	  
	  public String lowScore(Node head)
	  {
		  int min = Integer.MAX_VALUE;
		  
		    while (head != null)
		    {
		 
		        
		        if (min > head.totalScore)
		            min = head.totalScore;
		        head = head.next;
		    }
		  System.out.println("The lowest score in the list is: " + min);
		  return null;
	  }

	}


