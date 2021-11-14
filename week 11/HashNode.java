package week11;

public class HashNode
{
	HashNode next;
	int customerID;
	String lastName;
	
	public HashNode(int customerID, String lastName)
	{
		this.customerID = customerID;
		this.lastName = lastName;
	}
}
