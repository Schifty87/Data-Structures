/*
This program introduces linked list concept
Program Name:  ListTest.java
Author:  Ryan J Schiferl
CS 223 (Data Structures) section 2
*/

package Lab1;

import Lab4.LinkedList;

public class ListTest {
	public static void main(String[] args) throws Exception{
		
		LinkedList animalList = new LinkedList();
		animalList.insertAtHead("Lion");
		animalList.insertAtHead("Tiger");
		animalList.insertAtHead("Dinosaur");
		animalList.insertAtHead("Giraffe");
		
		animalList.printList();
		
		animalList.insertAtTail("Cat");
		animalList.insertAtTail("Dog");
		
		animalList.printList();
		
		Object temp = animalList.removeFromHead();
		System.out.println("removing " + temp.toString());
		
		animalList.printList();
		
		temp = animalList.removeFromTail();
		System.out.println("removing " + temp.toString());
		
		animalList.printList();
	}
}
