package Project3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
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

		BinarySearchTree<String> StringTree;
		StringTree = new BinarySearchTree <String>();
		
		String file = "tweets.txt";
		
		try(Scanner scanner = new Scanner(new File(file))){
			while(scanner.hasNext()){
				String X = scanner.nextLine();
				StringTree.insertNode(X);
				
		
			}			
		}catch(Exception e){
			System.out.print("error");
		}
		
		System.out.print("Enter your sentence followed with a hashtag: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String[] Z = sentence.split(" ");
		
		Epic epic = new Epic();
		
		epic.tweet(StringTree, sentence);
		
		
		
		/*for(int i=0; i<Z.length; i++){
			if(Z[i].charAt(0)==('#')){
				String name = Z[i].substring(1);
				
				int X = StringTree.getPreOrder(StringTree, name);
				String Y = StringTree.getInt(StringTree, name);
				
				if(X==1){
					System.out.println("#" + name.toLowerCase() + " is one of the top-100 trending tweets" + "(" + Y + ")");		
				}
				else{
					System.out.println("#" + name.toLowerCase() + " is not one of the top-100 tending tweets");			
				}
			}
		}*/
		
		
	
	}
}
