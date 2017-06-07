package Lab2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
		
	public void selectionSortList(LinkedList aList){
		
		String temp;
		int minIndex;
		
		for(int i=0; i<aList.size()-1; i++){
			minIndex = i;
			for(int j=i+1; j< aList.size(); j++){
				if(((String)aList.get(j)).compareTo((String) aList.get(minIndex)) < 0){
					minIndex = j;
				}
			}
			
			if(minIndex != i){
				//swap between minIndex and i
				temp = (String) aList.get(i);
				aList.set(i,  (String) aList.get(minIndex));
				aList.set(minIndex, temp);				
			}
			printList(aList);
		}
	}
	
	
	public void printUpperCaseList(LinkedList aList){
		ListIterator interList = aList.listIterator();
		while(interList.hasNext()){
			System.out.println(((String) interList.next()).toUpperCase());
		}
	}
	
	public void printList(LinkedList aList){
		ListIterator interList = aList.listIterator();
		while(interList.hasNext()){
			System.out.print(interList.next().toString() + " ");
		}
		System.out.println();
	}
	
	public void printListInReverse(LinkedList aList){
		ListIterator interList = aList.listIterator(aList.size()); //go to the end
		while(interList.hasPrevious()){
			System.out.println(interList.previous().toString());
		}
	}
	
	public static void main(String[] args){
		
		//Declare and create a LinkledList object and initialize as follows “black”, “yellow”, “green”, “blue”, “violet”, “silver”	
		LinkedList<String> aList = new LinkedList<String>();
		aList.add("Black");
		aList.add("yellow");
		aList.add("green");
		aList.add("blue");
		aList.add("violet");
		aList.add("silver");
		
		LinkedListTest obj = new LinkedListTest();
		obj.printList(aList);
		
		obj.printUpperCaseList(aList);
		
		//remove silver from the list
		aList.remove("silver");
		System.out.println(" List after removing ");
		obj.printList(aList);
		
		//print the list in reverse
		System.out.println(" Print list in reverse ");
		obj.printListInReverse(aList);
		System.out.println(" Sort this list alphabetically ");
		obj.selectionSortList(aList);
		
	}
}
