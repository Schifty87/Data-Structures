package HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/*
 * 1-> many mapping
 * <String, LinkedList<String>
 * "A" -> "Apple" "Agriculture" "Art"
 * "B" -> "Banana "Beach"
 * "C" -> "Cat" "Car"
 */

public class TraditionalMultimap {

	public static void main(String[] args) {
		
		//declaration of a multimap
		
		HashMap<String, LinkedList<String>> aMultiMap = new HashMap<String, LinkedList<String>>();
		
		//create Link lists
		LinkedList<String> ListA = new LinkedList<String>();
		ListA.add("Apple");
		ListA.add("Agriculture");
		ListA.add("Art");
		
		LinkedList<String> ListB = new LinkedList<String>();
		ListB.add("Banana");
		ListB.add("Beach");
		
		LinkedList<String> ListC = new LinkedList<String>();
		ListC.add("Cat");
		ListC.add("Car");
		
		//Populate the multimap
		aMultiMap.put("A", ListA);
		aMultiMap.put("B", ListB);
		aMultiMap.put("C", ListC);
		
		//Navigate through this map
		Set<String> kSet = aMultiMap.keySet();
		Iterator<String> kIter = kSet.iterator();
		
		while(kIter.hasNext()){
			String aKey = kIter.next();
			System.out.print(" Key: " + aKey+ " has values: ");
			LinkedList lValue = aMultiMap.get(aKey);
			Iterator<String> lIter = lValue.iterator();
			while(lIter.hasNext()){
				System.out.print(lIter.next() + " ");
			}
			System.out.println();
		}
		
	}

}
