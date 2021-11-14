package week11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashDemo1
{
	/*
		hashArray[0] -> Barnes 
		hashArray[1] -> Andrews -> Mathison -> Jones
		hashArray[2] -> Yates   -> Carlson
	*/
	
	public static String[] dataArray;
	public static int[] customerIDsArray;
	public static HashNode hashArray[] = new HashNode[3];

	public static void main(String[] args)
	{
		List<Integer> ids = new ArrayList<Integer>();
		List<String> names = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		String line = "";
		String cvsSplitBy = ",";
		BufferedReader br = null;
		try {
	        br = new BufferedReader(new FileReader("C:\\Users\\caleb\\eclipse-workspace\\2420_Week11\\src\\week11\\HashingDemoDataFile.csv"));
	        while ((line = br.readLine()) != null) {

	                // use comma as separator
	            String[] row = line.split(cvsSplitBy);

	            String id = row[0];
	            String name = row[1];
	            
	            ids.add(Integer.parseInt(id));
	            names.add(name);
	            
	            dataArray = names.toArray(new String[names.size()]);
	            customerIDsArray = ids.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
	            
	            
	            
	            
	            
	            


	        }

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
			if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
		displayDataArray();
		displayHashExampleOutput();
		for (int j = 0; j < dataArray.length; j++)
		{
			appendNode(hashIt(dataArray[j]), customerIDsArray[j], dataArray[j]);
		}
		displayHashArray();
		
		System.out.println("Insert the name of the user you'd like to search for");
		String input = scanner.nextLine();
		
		search(input);
		
		
		
	}
	
	private static void displayHashExampleOutput() 
	{
		int asciiTotal = 0;
		for (int j = 0; j < dataArray.length; j++)
		{
			for (int k = 0; k < dataArray[j].length(); k++)
			{
				char c = dataArray[j].charAt(k);
				System.out.println(c + "  " + (int)c);
				asciiTotal = asciiTotal + (int)c;
			}
			System.out.print("asciiTotal: " + asciiTotal);
			System.out.println("\t[" + asciiTotal % hashArray.length + "]\n");
			asciiTotal = 0;
		}
	}

	private static void displayDataArray() 
	{
		for (int i = 0; i < dataArray.length; i++)
		{
			System.out.printf("dataArray[%d]: %s%n", i, dataArray[i]);
		}
		System.out.println();
		for (int i = 0; i < customerIDsArray.length; i++)
		{
			System.out.printf("customerIDsArray[%d]: %s%n", i, customerIDsArray[i]);
		}
		System.out.println();
	}

	public static int hashIt(String data)
	{
		int asciiTotal = 0;
		for (int n = 0; n < data.length(); n++)
		{
			char c = data.charAt(n);
			asciiTotal = asciiTotal + (int)c;
		}
		return asciiTotal % hashArray.length;
	}
	
	public static void appendNode(int arrayIndex, int customerID, String name)
	{
		if (hashArray[arrayIndex] == null)
		{
			hashArray[arrayIndex] = new HashNode(customerID, name);
		}
		else
		{
			HashNode current = hashArray[arrayIndex];
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new HashNode(customerID, name);
		}
	}

	public static void displayHashArray()
	{
		for (int i = 0; i < hashArray.length; i++)
		{
			System.out.printf("hashArray[%d]", i);
			if (hashArray[i] != null)
			{
				HashNode current = hashArray[i];
				System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				while (current.next != null)
				{
					current = current.next;
					System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				}
			}
			System.out.println();;
		}
	}
	

	public static String search(String key)

	{

		long startTime = System.currentTimeMillis();
		int hashPos= hashIt(key);
		

		for (int i = 0; i < hashArray.length; i++)
		{
			System.out.printf("hashArray[%d]", i);
			if (hashArray[i] == hashArray[hashPos])
			{
				HashNode current = hashArray[i];
				long endTime = System.currentTimeMillis();
				System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				System.out.println("\nThat search took " + (endTime - startTime) + " milliseconds");
				return current.lastName;
				
			}
			
			else {
				
			}
		

	}
		return key;

	}
	
	
	}
	

