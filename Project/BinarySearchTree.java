package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTree

{

    
	public static void main(String[] args)

   {                 

       Scanner scan = new Scanner(System.in);

       /* Creating object of BST */

       BST bst = new BST();
       List<Integer> list = new ArrayList<Integer>();
       
       Scanner scanner = new Scanner(System.in);
		String line = "";
		String cvsSplitBy = ",";
		BufferedReader br = null;
		try {
	        br = new BufferedReader(new FileReader("C:\\Users\\caleb\\eclipse-workspace\\2420_Project\\src\\nums.csv"));
	        while ((line = br.readLine()) != null) {

	                // use comma as separator
	            String[] row = line.split(cvsSplitBy);
	            int [] rows = new int[row.length];
	            for(int i = 0;i < row.length;i++)
	            {
	               
	               rows[i] = Integer.parseInt(row[i]);
	               bst.insert(rows[i]);
	            }
	            

	           // String id = row[0];
	            // String name = row[1];
	            
	            /*ids.add(Integer.parseInt(id));
	            names.add(name);
	            
	            dataArray = names.toArray(new String[names.size()]);
	            customerIDsArray = ids.stream().filter(i -> i != null).mapToInt(i -> i).toArray();*/	            
	            
	            
	            
	            
	            


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

       System.out.println("Binary Search Tree Test\n");          

       char ch;

       /*  Perform tree operations  */

       do    

       {

           System.out.println("\nBinary Search Tree Operations\n");

           System.out.println("1. insert ");

           System.out.println("2. delete");

           System.out.println("3. search");

           System.out.println("4. count nodes");

           System.out.println("5. check empty"); 
           
           System.out.println("6. isolate nodes");



           int choice = scan.nextInt();            

           switch (choice)

           {

           case 1 : 

               System.out.println("Enter integer element to insert");

               bst.insert( scan.nextInt() );   
               

               break;                          

           case 2 : 

        	   
               System.out.println("Enter integer element to delete");
               

               bst.delete( scan.nextInt() );  
               

               break;                         

           case 3 : 

               System.out.println("Enter integer element to search");
               

               System.out.println("Search result : "+ bst.search( scan.nextInt() ));
               
               

               break;                                          

           case 4 : 

               System.out.println("Nodes = "+ bst.countNodes());

               break;     

           case 5 :  

               System.out.println("Empty status = "+ bst.isEmpty());

               break;      

           case 6 :
               
               while (true) { 
            	   System.out.println("Enter integer element(s) you would like to isolate or 0 to exit");
            	   int iso = scan.nextInt();
            	   
            	   if (bst.search(iso) == true) {
            		   System.out.println("Element found... Added to list\n");
            		   list.add(iso);
            		   }           		   
            	   
            	   else if (iso == 0) {
            		   break;
            	   }
            	   
            	   else {
            		   System.out.println("Element not found\n");
            	   }
               }

               System.out.println("Isolated Elements: \n" + list);
               break;  

           default : 

               System.out.println("Wrong Entry \n ");

               break;   

           }

           /*  Display tree  */ 

           System.out.print("\nPost order : ");

           long startTime = System.currentTimeMillis();
           
           bst.postorder();
           
           long endTime = System.currentTimeMillis();
           System.out.println("\nThat traversal took " + (endTime - startTime) + " milliseconds");

           System.out.print("\nPre order : ");

           long startTime2 = System.currentTimeMillis();
           
           bst.preorder();
           
           long endTime2 = System.currentTimeMillis();
           System.out.println("\nThat traversal took " + (endTime2 - startTime2) + " milliseconds");

           System.out.print("\nIn order : ");

           long startTime3 = System.currentTimeMillis();
           bst.inorder();
           long endTime3 = System.currentTimeMillis();
           System.out.println("\nThat traversal took " + (endTime3 - startTime3) + " milliseconds");



           System.out.println("\nDo you want to continue (Type y or n) \n");

           ch = scan.next().charAt(0);                        

       } while (ch == 'Y'|| ch == 'y');               

   }

}
