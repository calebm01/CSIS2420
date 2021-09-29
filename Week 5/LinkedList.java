package week5;

public class LinkedList
{
  Node head;

  public void append(int data)
  {
    if (head == null)
    {
      head = new Node(data);
      return;
    }
    Node current = head;
    while (current.next != null)
    {
      current = current.next;
    }
    current.next = new Node(data);
  }
  
  public void prepend(int new_data)
  {
      
      Node new_node = new Node(new_data);
   
      
      new_node.next = head;
   
      
      head = new_node;
  }
  
  
  void delete(int key)
  {
      
      Node temp = head, prev = null;

      
      if (temp != null && temp.data == key) {
          head = temp.next; // Changed head
          return;
      }

      
      while (temp != null && temp.data != key) {
          prev = temp;
          temp = temp.next;
      }

      
      if (temp == null)
          return;

      
      prev.next = temp.next;
  }
  
  
  public String search(Node head, int x)
  {
      Node current = head;    //Initialize current
      while (current != null)
      {
          if (current.data == x)
              return "data found at " + current.data;    
          current = current.next;
      }
      return "data not found";    
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

  public void printList()
  {
    Node current = head;
    System.out.print("List Contents: ");
    while (current != null)
    {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

}