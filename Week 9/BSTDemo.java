package week9;

import java.util.Random;

public class BSTDemo {
	
	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		// Sample Data: 20, 33, 18, 19, 46, 29, 4, 62
		int min = 100000;
        int max = 999999;
        int numAccounts = 1000000;
        Random rand = new Random();
        for (int i = 1; i <= numAccounts; i++)
        {
            bst.insert((rand.nextInt((max - min) + 1) + min));
            System.out.println("\n");
        }
        long startTime = System.currentTimeMillis();
		System.out.print("PreOrder Traverse:\t");
		bst.preOrderTraverse(bst.root);
		System.out.println();
		System.out.print("InOrder Traverse:\t");
		bst.inOrderTraverse(bst.root);
		System.out.println();
		System.out.print("PostOrder Traverse:\t");
		bst.postOrderTraverse(bst.root);
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("\nThat took " + (endTime - startTime) + " milliseconds");
	}

}
