package week6;

public class Node {
	
	Node next;
	  int ID;
	  String firstName;
	  String lastName;
	  String playerName;
	  String playerType;
	  double lifePoints;
	  int totalScore;

	  public Node(int ID, String firstName, String lastName, String playerName, String playerType, double lifePoints, int totalScore)
	  {
		  this.ID = ID;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.playerName = playerName;
		  this.playerType = playerType;
		  this.lifePoints = lifePoints;
		  this.totalScore = totalScore;
	    
	  }

	}


