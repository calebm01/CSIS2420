package week10;

import java.util.Scanner;

public class BSTMain {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		BSTNode head = null;
		
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int choice;
		
		do {
			displayMenu();
			choice = input.nextInt();
			input.nextLine();
			int IPChoice;
			String name;
			switch(choice) {
			
				case 1:
					System.out.println("Building tree...");
					bst.insert(150,"jkeller");
					bst.insert(174,"dbaxley");
					bst.insert(41,"tpogue");
					bst.insert(165,"tmarble");
					bst.insert(218,"mloera");
					bst.insert(20,"kholm");
					bst.insert(201,"camos");
					bst.insert(91,"lpippin");
					bst.insert(11,"lcronin");
					bst.insert(77,"malbert");
					break;
					
				case 2:
					System.out.println("Enter the IP you are trying to search for: ");
					IPChoice = input.nextInt();
					bst.searchID(IPChoice);
					break;
					
				case 3:
					System.out.println("Enter the username you are trying to search for: ");
					name = input.nextLine();
					bst.searchName(name);
					break;
					
				case 4:
					System.out.println("The total number of nodes is: " + bst.countNode(head));
					break;
					
				case 5:
					System.out.println("");
					bst.inOrder();
					break;
					
				case 6:
					quit = true;
					break;
					
				default:
					System.out.println("Invalid input");
			}
			System.out.println("\n\n\n");
		} while (!quit);
		System.out.println("\n\nGoodbye");
		input.close();

	}
	
	private static void displayMenu() {
		System.out.println("1 Build Users Tree\n");
		System.out.println("2 Find by IP Address\n");
		System.out.println("3 Find by Username\n");
		System.out.println("4 Report Number of Nodes\n");
		System.out.println("5 Print Entire Tree\n");
		System.out.println("6 Exit\n");
		System.out.println("\n\n Enter 1, 2, 3, 4, 5 or 6");
	}

}
