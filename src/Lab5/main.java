package Lab5;

import java.util.Random;
import java.io.*;

public class main {
	
	public static void writeTree(BinarySearchTree aTree, String filename){
		try{
			ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(filename));
			outStream.writeObject(aTree);
			outStream.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//recover saved file
	public static <E> BinarySearchTree<E> readTree(String filename) {
		try{
			FileInputStream fsStream = new FileInputStream(filename);
			ObjectInputStream oStream = new ObjectInputStream(fsStream);
			BinarySearchTree aTree = (BinarySearchTree) oStream.readObject();
			oStream.close();
			return aTree;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree<Integer> intTree;
		intTree = new BinarySearchTree <Integer>();
		
		final int MAXVALUE = 100;
		final int count = 10;
		
		/*Random rd = new Random();
		for(int i=0; i< count; i++){
			Integer label = new Integer(rd.nextInt(MAXVALUE));
			System.out.print(label + " ");
			intTree.insertNode(label);
		}*/
		
		intTree.insertNode(70);
		intTree.insertNode(50);
		intTree.insertNode(80);
		intTree.insertNode(25);
		intTree.insertNode(55);
		intTree.insertNode(75);
		intTree.insertNode(95);
		intTree.insertNode(9);
		intTree.insertNode(60);
		
		
		
		System.out.println("\n In-order traversal");
		System.out.println(intTree.getInorderTraversal(intTree));
		
		System.out.println("\n Pre-order traversal");
		System.out.println(intTree.getPreOrder(intTree));
		
		System.out.println("\n Post-order traversal");
		System.out.println(intTree.getPostOrder(intTree));
		
		//create new file in which to save tree
		writeTree(intTree, "binaryTree.txt");
		
		/*intTree = readTree("binarytree.out");
		System.out.println("\n Inorder traversal");
		System.out.println(intTree.getInorderTraversal(intTree));*/
		
		
	}

}
