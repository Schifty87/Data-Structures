package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ListIterator;

import Project1.ListNode;

public class main {
	public static void main(String[] args) throws FileNotFoundException{
		
		String file = "titanic.txt";
		
		//for original list
		LinkedList L = new LinkedList();
		//for first sort
		LinkedList L1 = new LinkedList();
		//for second sort
		LinkedList L2 = new LinkedList();
		//call in instance of sort
		sort s = new sort();
		//create original list
		L = s.original(file);
		int Q;
		
		do{
		
			System.out.println("1 - Display the original list" + "\n" + "2 - Survival/Mortality Report" + "\n" + "3 - Leave program");
			System.out.print("What would you like to to? ");
			Scanner scan = new Scanner(System.in);
			Q = scan.nextInt();
			System.out.println();
			
			if(Q == 1){
				L.printList();
			}
			
			if(Q == 2){
				L.stats();
			}
			System.out.println();
		}while(Q != 3);			
	}	
}
