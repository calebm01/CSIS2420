package week6;

import java.util.Scanner;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

public class playerMain {

	public static void main(String[] args) {
		
		playerLinkedList players = new playerLinkedList();
		
		players.append(1122, "Wendell", "Dunn", "Rowland", "Warlock", 203.01, 90217);
		players.append(1151, "Tyrone", "Wise", "Conrad", "Thief", 235.66, 53603);
		players.append(1241, "Sylvia", "Todd", "Jenkins", "Thief", 144.79, 57248);
		players.append(1268,"Kevin", "Nguyen", "Warren" , "Thief", 716.12, 36752);
		players.append(1274, "Tara", "Barrett", "Chen" , "Sorcerer", 314.46, 43771);
		players.append(1317, "Kate", "Lamb", "Esparza", "Warrior", 393.89, 97702);
		players.append(1321, "Louis", "Blair", "Flynn", "Monk", 727.39, 7135);
		players.append(1326, "Jean", "Bowers", "Knapp", "Thief", 792.96, 62279);
		players.append(1351, "Sheryl", "Montgomery", "Davenport", "Witch", 383.88, 48165);
		players.append(1370, "Jo", "Cummings", "Contreras", "Ranger", 337.96, 19510);
		
		/* try(Scanner reader = new Scanner(playerMain.class.getResourceAsStream("Players.csv"))) {
			
			while (reader.hasNextLine()) {
				System.out.println(reader.next());;
			}
			
		} */
		
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int choice;
		int IDchoice;
		String firstName;
		String lastName;
		String playerName;
		String playerType;
		Random rnd = new Random();
		int number = rnd.nextInt(9999);
		
		
		do {
			displayMenu();
			choice = input.nextInt();
			input.nextLine();
			switch(choice) {
				case 1:
					System.out.println("Enter your first name: ");
					firstName = input.nextLine();
					System.out.println("Enter your last name: ");
					lastName = input.nextLine();
					System.out.println("Enter your player's name: ");
					playerName = input.nextLine();
					System.out.println("Enter your player type: ");
					playerType = input.nextLine();
					players.append(number, firstName, lastName, playerName, playerType, 0, 0);
					break;
					
				case 2:
					System.out.println("Enter the Player ID of the player you want to delete: ");
					IDchoice = input.nextInt();
					players.delete(IDchoice);
					break;
					
				case 3:
					
					System.out.println("\n the total amount of players is: " + players.length() + "\n\n");
					break;
					
				case 4:
					players.printPlayerList();
					break;
					
				case 5:
					System.out.println("Enter the Player ID of the player you want to search for: ");
					IDchoice = input.nextInt();
					players.searchID(IDchoice);
					break;
					
				case 6:
					System.out.println("Enter the First Name of the player you want to search for: ");
					firstName = input.nextLine();
					System.out.println("Enter the Last Name of the player you want to search for: ");
					lastName = input.nextLine();
					players.searchName(firstName, lastName);
					break;
					
				case 7:
					System.out.println("Enter the Player Name of the player you want to search for: ");
					playerName = input.nextLine();
					players.searchPlayerName(playerName);
					break;
					
				case 8:
					players.highScore(players.head);
					break;
					
				case 9:
					players.lowScore(players.head);
					break;
					
				case 0:
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
		System.out.println("1. Add player\n");
		System.out.println("2. Delete a player\n");
		System.out.println("3. Report total number of players\n");
		System.out.println("4. Print full player list\n");
		System.out.println("5. Search by player ID\n");
		System.out.println("6. Search by player's name\n");
		System.out.println("7. Search by player's in-game name\n");
		System.out.println("8. Report highest total score\n");
		System.out.println("9. Report lowest total score\n");
		System.out.println("0. Exit\n");
		System.out.println("\n\n Enter menu choice (1-9 or 0)");
	}

}
